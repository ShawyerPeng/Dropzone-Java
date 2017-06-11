// package dropzone;
//
// import com.oreilly.servlet.multipart.FilePart;
// import com.oreilly.servlet.multipart.MultipartParser;
// import com.oreilly.servlet.multipart.Part;
// import org.apache.commons.fileupload.FileItem;
// import org.apache.commons.fileupload.FileUploadException;
// import org.apache.commons.fileupload.disk.DiskFileItemFactory;
// import org.apache.commons.fileupload.servlet.ServletFileUpload;
// import org.apache.commons.io.FilenameUtils;
//
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import java.io.File;
// import java.io.IOException;
// import java.io.InputStream;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;
// import java.util.List;
//
// @WebServlet("/UploadServlet")
// public class UploadServlet extends HttpServlet {
//     private String fileSavePath;
//     private static final String UPLOAD_DIRECTORY = "upload";
//
//     public void init() {
//         // fileSavePath = getServletContext().getRealPath("/") + File.separator + UPLOAD_DIRECTORY;/*save uploaded files to a 'Upload' directory in the web app*/
//         // if (!(new File(fileSavePath)).exists()) {
//         //     (new File(fileSavePath)).mkdir();    // creates the directory if it does not exist
//         // }
//         fileSavePath = "D" + File.separator + "img";
//     }
//
//     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         Connection con = null;
//
//         List<FileItem> items;
//         try {
//             items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
//             for (FileItem item : items) {
//                 if (item.isFormField()) {
//                     // Process regular form field (input type="text|radio|checkbox|etc", select, etc).
//                     String fieldname = item.getFieldName();
//                     String fieldvalue = item.getString();
//                 } else {
//                     // Process form file field (input type="file").
//                     String fieldname = item.getFieldName();
//                     String filename = FilenameUtils.getName(item.getName());
//                     InputStream filecontent = item.getInputStream();
//                     // ... (do your job here)
//                 }
//             }
//         } catch (FileUploadException e1) {
//             e1.printStackTrace();
//         }
//         String fullname = request.getParameter("fullname");
//         System.out.println(fullname);
//         String path = null;
//         String message = null;
//         String resp = "";
//         int i = 1;
//         resp += "<br>Here is information about uploaded files.<br>";
//
//         try {
//             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/upload", "root", "123");
//
//             String sql = "INSERT INTO details(id, iname, iurl) values(?,?,?)";
//             PreparedStatement statement = con.prepareStatement(sql);
//
//             MultipartParser parser = new MultipartParser(request, 1024 * 1024 * 1024);  /* file limit size of 1GB*/
//             Part _part;
//             while ((_part = parser.readNextPart()) != null) {
//                 if (_part.isFile()) {
//                     FilePart fPart = (FilePart) _part;  // get some info about the file
//                     String name = fPart.getFileName();
//                     if (name != null) {
//                         long fileSize = fPart.writeTo(new File(fileSavePath));
//                         resp += i++ + ". " + fPart.getFilePath() + "[" + fileSize / 1024 + " KB]<br>";
//                     } else {
//                         resp = "<br>The user did not upload a file for this part.";
//                     }
//                 }
//             }
//
//             statement.setString(1,"id");
//             statement.setString(2,"iname");
//             statement.setString(3,"iurl");
//             int row = statement.executeUpdate();
//             if(row>0){
//                 message = "Contact saved";
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//             message = "ERROR: " +e.getMessage();
//         }
//         finally {
//             if(con !=null) {
//                 try {
//                     con.close();
//                 }
//                 catch(SQLException ex) {
//                     ex.printStackTrace();
//                 }
//             }
//             System.out.println(message);
//             request.setAttribute("Message", message);
//             getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
//         }
//     }
//
//
//     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//     }
// }
