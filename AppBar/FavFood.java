package com.example.android.appbar;

/**
 * Created by Nuzulul Kurniansyah on 12/10/2015.
 */
    public class FavFood {

        private float ratingStar;
        private String name;
        private String price;
        private String location;

        public FavFood(int ratingStar, String name, String price, String location) {
            this.ratingStar = ratingStar;
            this.name = name;
            this.price = price;
            this.location=location;
        }


        public float getRatingStar() {
            return ratingStar;
        }

        public void setRatingStar(float ratingStar) {
            this.ratingStar = ratingStar;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
        public String getLocation() {
            return location;
        }

        public void setLocation(String price) {
            this.location = location;
        }

    }


