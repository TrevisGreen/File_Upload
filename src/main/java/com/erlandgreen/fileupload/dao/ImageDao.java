package com.erlandgreen.fileupload.dao;

import com.erlandgreen.fileupload.model.Image;

import java.util.List;

public interface ImageDao {

    public List<Image> list();

    public Image create(Image image);

    public Image get(Long id);

    public void delete(Image image);
}
