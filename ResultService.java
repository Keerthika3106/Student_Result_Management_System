public class ResultService {
    public void addResult(Student s) throws Exception {
        String sql = "INSERT INTO results VALUES(?,?,?,?,?)";
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, s.getId());
        ps.setString(2, s.getName());
        ps.setString(3, s.getSubject());
        ps.setDouble(4, s.getMarks());
        ps.setString(5, s.getGrade());
        ps.executeUpdate();
    }
}
