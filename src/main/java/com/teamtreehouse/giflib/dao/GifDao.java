package com.teamtreehouse.giflib.dao;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface GifDao {
    List<Gif>findAll();
    Gif findById(long id);
    void save(Gif gif);
    void delete(Gif gif);
}
