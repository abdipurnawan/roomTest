package com.unud1805551051.roomtest;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface MainDao {
    //insert
    @Insert(onConflict = REPLACE)
    void insert(MainData mainData);

    //delete
    @Delete
    void delete(MainData mainData);

    //deleteall
    @Delete
    void reset(List<MainData> mainData);

    //update
    @Query("UPDATE tb_mahasiswa set mahasiswa = :sText WHERE ID = :sID")
    void update(int sID, String sText);

    //read
    @Query("SELECT * FROM tb_mahasiswa")
    List<MainData> getAll();
}
