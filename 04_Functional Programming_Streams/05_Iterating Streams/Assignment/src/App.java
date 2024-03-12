import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {


        List<Integer> ints = IntStream.rangeClosed(0,10).boxed().toList();

        ints.stream().forEach((i) -> System.out.println(i + 5));



        

        //TODO:  repeate the mapping wtih an extra div2Function and map the list of intsPlus5 to make
        // a list intsPlus5Div2.  
        //TODO:  use foreach to print intsPlus5Div2

        List<Integer> This_is_mabey_a_number_I_dont_know = IntStream.rangeClosed(0, 10).boxed().toList();
        Function<Integer, Integer> div2Function = (number) -> number / 2;

        List<Integer> This_is_mabey_a_number_I_dont_know_divided_by_two_by_mabey_three_I_dont_realy_know_numbers_that_well_so_it_could_be_three__or_even_four_but_five_is_right_out_im_not_that_stupid_yet = This_is_mabey_a_number_I_dont_know.stream().map(div2Function).toList();

        Consumer<Integer> Just_print_this_number_yea = (number) -> System.out.println(number);
        This_is_mabey_a_number_I_dont_know_divided_by_two_by_mabey_three_I_dont_realy_know_numbers_that_well_so_it_could_be_three__or_even_four_but_five_is_right_out_im_not_that_stupid_yet.stream().forEach(Just_print_this_number_yea);


        List<Integer> intz = IntStream.rangeClosed(0, 10).boxed().toList();
        Function<Integer, Integer> add5Func = (number) -> number + 5;  //TODO:  acutally implement the lambda correctly

        List<Integer> intsPlus5 = intz.stream().map(add5Func).toList();

        Consumer<Integer> intPrinter = (number) -> System.out.println(number);
        intsPlus5.stream().forEach(intPrinter);

        //TODO:  write a div2Func Function like I did with add5Func
        //TODO:  apply div2Func to intsPlus5 with map
        //TODO:  print with foreach.  

    }
}
