package hotel;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String street;
    private  int number;
    private  String  city;
    public static class Builder {

        private String street;
        private int number;
        private String city;

        public  Builder(String street){
            this.street = street;
        }

        public Builder nameNumber(int number){
            this.number = number;

            return this;
        }

        public Builder showCity(String city){
            this.city = city;

            return this;
        }
       public  Address build(){
            Address address = new Address();
            address.street = this.street;
            address.number=this.number;
            address.city=this.city;

            return address;

       }





    }


}
