package generics;

import java.util.ArrayList;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {
        List<String> langs = new ArrayList<>();
        langs.add("JS");
        langs.add("PHP");
        langs.add("Java");

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(99);

        String ultimaLinguagem = ListaUtil.getUltimo(langs);
        System.out.println(ultimaLinguagem);

        Integer ultimoInteiro = ListaUtil.getUltimo(nums);
        System.out.println(ultimoInteiro);
    }
}
