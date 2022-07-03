<%@ page language="java" contentType="text/html" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%!
    public int nullIntconv(String str) {
        int conv = 0;
        if (str == null) {
            str =
          "0";
}
else if ((str.trim()).equals(
            "null"))
{
str =
        "0";
}
else if (str.equals(
        
            ""))
{
str =
        
        "0";
}
try {
            conv = Integer.parseInt(str);
        } catch (Exception e) {
        }
        return conv;
    }
%>
<%

    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbname = "demodatapro";
    String username = "root";
    String pswd = "";
    String drivername = "com.mysql.jdbc.Driver";
    try {
        Class.forName(drivername).newInstance();
        con = DriverManager.getConnection(url + dbname, username, pswd);
    } catch (Exception ex) {
        System.out.println("Not connected to database");
    }
        
    ResultSet 
    rsPagination = null;
ResultSet rsRowCnt = null;

    PreparedStatement psPagination = null;
    PreparedStatement psRowCnt = null;

    int iShowRows = 5; // Number of records show on per page
    int iTotalSearchRecords = 10; // Number of pages index shown

    int iTotalRows = nullIntconv(request.getParameter("iTotalRows"));
int iTotalPages = nullIntconv(request.getParameter("iTotalPages"));
int iPageNo = nullIntconv(request.getParameter("iPageNo"));
int cPageNo = nullIntconv(request.getParameter("cPageNo"));

int iStartResultNo = 0;
    int iEndResultNo = 0;

    if (iPageNo == 0) {
        iPageNo = 0;
    } else {
        iPageNo = Math.abs((iPageNo - 1) * iShowRows);
    }
    String sqlPagination ="SELECT SQL_CALC_FOUND_ROWS * FROM mydata order by name limit '"+iPageNo +"','"+iShowRows +"'";

psPagination = con.prepareStatement(sqlPagination);
    rsPagination = psPagination.executeQuery();

//// this will count total number of rows
    String sqlRowCnt ="SELECT FOUND_ROWS() as cnt FROM mydata";
psRowCnt = con.prepareStatement(sqlRowCnt);
    rsRowCnt = psRowCnt.executeQuery();

    if (rsRowCnt.next()) {
        iTotalRows = rsRowCnt.getInt("cnt");
}
%>
<html>
    <head>
        <title>Pagination of JSP page</title>

    </head>
    <body>
        <form name=?frm?>
            <input type=?hidden? name=?iPageNo? value=?<%=iPageNo%>?>
            <input type=?hidden? name=?cPageNo? value=?<%=cPageNo%>?>
            <input type=?hidden? name=?iShowRows? value=?<%=iShowRows%>?>
            <table width=?100%? cellpadding=?0? cellspacing=?0? border=?1? >
                <tr>
                    <td>Id</td>
                    <td>Name</td>
                    <td>Value</td>
                </tr>
                <%
                    while (rsPagination.next()) {
                %>
                <tr>
                    <td><%=rsPagination.getString("id")%></td>
                    <td><%=rsPagination.getString("name")%></td>
                    <td><%=rsPagination.getString("value")%></td>
                </tr>
                <%
                }
                %>
                <%
                //// calculate next record start record and end record
                try {
                        if (iTotalRows < (iPageNo + iShowRows)) {
                            iEndResultNo = iTotalRows;
                        } else {
                            iEndResultNo = (iPageNo + iShowRows);
                        }

                        iStartResultNo = (iPageNo + 1);
                        iTotalPages = ((int) (Math.ceil((double) iTotalRows / iShowRows)));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                %>
                <tr>
                    <td colspan=?3?>

                        0)
                        {
                        %>
                        &cPageNo=?>
                        ? style=?cursor:pointer;color: red?>

                        ?>
                        iTotalSearchRecords && i
                        &cPageNo=?> >> Next

                        

                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
<%    try {
        if (psPagination != null) {
            psPagination.close();
        }
        if (rsPagination != null) {
            rsPagination.close();
        }

        if (psRowCnt != null) {
            psRowCnt.close();
        }
        if (rsRowCnt != null) {
            rsRowCnt.close();
        }

        if (con!= null) 
        {
            con.close();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>