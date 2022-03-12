import java.util.*;

public class List {

    public static void main(String[] args) {

        GenArrayList<Atk> kodeAB = new GenArrayList<>(5);
        GenArrayList<Bag> kodeC = new GenArrayList<>(5);

        kodeAB.addData(new Atk("A001","Pulpen","Standart",10));
        kodeAB.addData(new Atk("A002","Spidol","Snowman",35));
        kodeAB.addData(new Atk("A003","Pensil","Joiko",15));
        kodeAB.addData(new Atk("B001","Buku","SiDu",20));
        kodeAB.addData(new Atk("B002","Kertas","A4",30));

        kodeC.addData(new Bag("C004","Tas","Silver Bag",15));
        kodeC.addData(new Bag("C005","Tas","Polo",25));
        kodeC.addData(new Bag("C002","Tempat Pensil","Snow",5));
        kodeC.addData(new Bag("C001","Penggaris","Joiko",24));
        kodeC.addData(new Bag("C003","Tote Bag","Polo",30));

        kodeC.removeData(new Bag("C004", "Tas", "Silver Bag",15));
        kodeC.editData(new Bag("C002","Tempat Pensil","Snow",5),
                        (new Bag("C002","Sling Bag","Snow",10)));
        kodeAB.displaySort();
        kodeC.displaySort();
    }
}