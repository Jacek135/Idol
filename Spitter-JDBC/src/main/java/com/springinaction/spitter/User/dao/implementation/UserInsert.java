package com.springinaction.spitter.User.dao.implementation;

import com.springinaction.spitter.User.dao.UserDAO;
import com.springinaction.spitter.User.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Configuration
public class UserInsert implements UserDAO {

    @Autowired
    private DataSource dataSource;

    private static final String SQL_INSERT_SPITTER =
            "insert into spitter (username, password, fullname) values (?, ?, ?)";
    private static final String SQL_SELECT_SPITTER =
            "select * from spitter where id = ?";

    public void insertSpitter(Spitter spitter) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT_SPITTER);

            stmt.setString(1, spitter.getUserName());
            stmt.setString(2, spitter.getPassword());
            stmt.setString(3, spitter.getFullName());

            stmt.execute();

        } catch (SQLException e) {

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {

            }
        }
    }

    @Override
    public Spitter findBySpitterId(int SpitterId) {
        Spitter spitter = null;

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_SPITTER);
            stmt.setLong(1, SpitterId);

            rs = stmt.executeQuery();

            if (rs.next()) {
                spitter = new Spitter(
                        SpitterId,
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullname")
                );
            }

        } catch (SQLException e) {

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
        return spitter;
    }
}
