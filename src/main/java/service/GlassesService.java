package service;

import model.Glasses;

import java.util.ArrayList;
import java.util.List;

public class GlassesService implements IGlassesService{
    public static List<Glasses> glasses = new ArrayList<>();
    static {
    glasses.add(new Glasses(1,"MK01", 250000,"đen","Kính cận","https://kinhmateyeplus.com/wp-content/uploads/2021/08/IMG_0656.jpg" ));
    glasses.add(new Glasses(2,"MK02", 550000,"đen","Kính guccu rep 1:1","https://wannahang.vn/images/products/2023/10/09/large/dsc08124-edit_1696845957.jpg" ));
    glasses.add(new Glasses(3,"MK03", 650000,"đen","Kính prada rep 1:1","https://matkinhthanhlich.com.vn/images/stories/virtuemart/product/kinh_mat_prada_PR_15WSF_09Q5S0.jpg" ));
    }
    public List<Glasses> findAll(){
        return glasses;
    }
    public void createGlasses(Glasses glass){
        glasses.add(glass);
    }

    @Override
    public void changeGlasses(Glasses glass) {

    }

    @Override
    public void deleteGlasses(Glasses glass) {
    glasses.remove(glass);
    }
}
