package com.sp.assign2.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sp.assign2.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int create(User user) {
        return jdbcTemplate.update("insert into user (userName, password) VALUE (?, ?)", user.getUsername(), user.getPassword());
    }

    public User read(int id) {
        try {
            return jdbcTemplate.queryForObject("select * from user where user_id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(User.class));
        } catch (Exception exception) {
            return null;
        }
    }

    public User read(String username) {
        try {
            return jdbcTemplate.queryForObject("select * from user where userName = ?", new Object[]{username}, new BeanPropertyRowMapper<>(User.class));
        } catch (Exception exception) {
            return null;
        }
    }

    public int update(User user) {
        return jdbcTemplate.update("update user set userName = ?, password = ? where user_id = ?", user.getUsername(), user.getPassword(), user.getId());
    }
    public int delete(int id) {
        return jdbcTemplate.update("delete from user where user_id = ?", id);
    }

    public List<User> getUser() {
        return jdbcTemplate.query("select * from user", (resultSet, user) -> new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
    }
    
//    public List<User> getUsers() {
//        return jdbcTemplate.query("select * from user", new RowMapper<User>() {
//            public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
//                int id = resultSet.getInt(1);
//                String username = resultSet.getString(2);
//                String password = resultSet.getString(3);
//                return new User();
//            }
//        });
//    }

}
