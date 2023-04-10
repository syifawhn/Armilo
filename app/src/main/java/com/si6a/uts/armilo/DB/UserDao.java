package com.si6a.uts.armilo.DB;


import java.util.List;

@Dao
public class UserDao {
    @Insert
    void insert(User user);

    @Query("SELECT * FROM")
    List<User> getAllUsers();
}
