package pl.dawid.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void shouldReturnDiscountedPrice() {

        //given
        Meal pizza = new Meal(20);

        //when
        int discantedPrice = pizza.getDiscountedPrice(5);

        //then
        assertEquals(15, discantedPrice);
    }

    @Test
    void referancesToTheSAmeObjectShouldBeEquall(){

        //Given
        Meal kabanos = new Meal(7);
        Meal podwawelska = kabanos;

        //When+then
        assertSame(kabanos, podwawelska);

    }

    @Test
    void referancesToDiferentObjectShouldBeEquall(){

        //Given
        Meal kabanos = new Meal(7);
        Meal podwawelska = new Meal(7);
        //When+then
        assertNotSame(kabanos, podwawelska);

    }

    @Test
    void toMealsShouldBeEqualWhenPriceAndTheNameIsTheSame(){

        //Given
        Meal pizza = new Meal(25, "Margaritta");
        Meal pizza2 = new Meal(25, "Margaritta");

        //Then

        assertEquals(pizza, pizza2);

    }

}