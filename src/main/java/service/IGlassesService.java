package service;

import model.Glasses;

import java.util.List;

public interface IGlassesService {
    List<Glasses> findAll();
    void createGlasses(Glasses glass);
    void changeGlasses(Glasses glass);
    void deleteGlasses(Glasses glass);

}
