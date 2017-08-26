package com.gnsmk;

class LineByLine {
    static boolean isSuccess = false;
    static String sql = "";

    public static void main(String[] args) throws java.io.IOException {

        com.opencsv.CSVReader reader = new com.opencsv.CSVReader(new java.io.FileReader("dd.csv"), ',');
        java.util.ArrayList<Employee> emps = new java.util.ArrayList<Employee>();
        String[] record = null;

        while ((record = reader.readNext()) != null) {
            emps.add(new Employee().setId(record[0]).setName(record[1]).setAge(record[2]));
        }

        System.out.println(emps);

        while (emps.size() != 0) {
            sql += "INSERT INTO `studentdetials`(`name`, `age`, `phone`) VALUES ('" + emps.get(0).id + "',"
                    + emps.get(0).name + "," + emps.get(0).age + ");";
            emps.remove(0);
        }
        reader.close();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = java.sql.DriverManager
                    .getConnection("jdbc:mysql://10.100.8.134:3306/jdbcpractice", "root", "");
            if (con != null) {
                try {
                    isSuccess = (con.prepareStatement(sql).executeUpdate() > 0);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (con != null) {
                        try {
                            con.close();
                        } catch (java.sql.SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}