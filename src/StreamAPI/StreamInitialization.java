package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInitialization {
    public static void main(String[] args) {

        // 1. From Collection Object
        List<String> value=List.of("One","two","three");
        Stream<String> stream1=value.stream();
        stream1.forEach(s-> System.out.println(s));

        System.out.println("********************");

        // Arrays of value
        String[] names=new String[]{"Irfan","Ashik","Danish"};
        Stream<String> stream= Arrays.stream(names);
        stream.forEach(s-> System.out.println(s));

        System.out.println("********************");

        // Stream Method
        Stream<String> stream3=Stream.of("X","Y","Z");
        stream3.forEach(s-> System.out.println(s));

        System.out.println("********************");

        // generate()
        Stream<String> stream4=Stream.generate(() -> "one").limit(1);
        stream4.forEach(s-> System.out.println(s));


        System.out.println("********************");

        // builder()
        // Builder Design Pattern

        Stream.Builder<String> streamBuilder=Stream.builder();
        Stream<String> stream5 = streamBuilder.add("one").add("two").build();
        stream5.forEach(s-> System.out.println(s));

        System.out.println("********************");

        // Empty Stream
        // empty()
        Stream<String> stream6=Stream.empty();
        stream6.forEach(s-> System.out.println(s));

    }




}
