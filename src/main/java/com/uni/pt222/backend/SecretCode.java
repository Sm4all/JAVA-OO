package com.uni.pt222.Backend;

import java.util.Random;

public class SecretCode {
    //OBJECTS
    private String secretCode;
    private String fragmentOne;
    private String fragmentTwo;
    private String fragmentThree;
    private String fragmentFour; //May be deleted
    private String fragmentFive; //May be deleted

    //METHOD
    public SecretCode (String secretCode) {  
        this.setSecretCode(secretCode);
        this.setFragmentOne(secretCode);
        this.setFragmentTwo(secretCode);
        this.setFragmentThree(secretCode);
        this.setFragmentFour(secretCode);
        this.setFragmentFive(secretCode);
    }

    //Setters
    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
        secretCode = "";
        for (int i=0; i < 15; i++) {
                Random r = new Random();
                secretCode = secretCode + (char)(r.nextInt(26) + 'A') + "-";
            }
    }

    public void setFragmentOne(String fragmentOne) {
        this.fragmentOne = fragmentOne;
        String[] parts = secretCode.split("-");
        fragmentOne = parts[0];
    }
    
    public void setFragmentTwo(String fragmementTwo) {
        this.fragmentTwo = fragmementTwo;
        String[] parts = secretCode.split("-");
        fragmementTwo = parts[1];
    }

    public void setFragmentThree(String fragmentThree) {
        this.fragmentThree = fragmentThree;
        String[] parts = secretCode.split("-");
        fragmentThree = parts[2];
    }

    public void setFragmentFour(String fragmentFour) {
        this.fragmentFour = fragmentFour;
        String[] parts = secretCode.split("-");
        fragmentFour = parts[3];
    }

    public void setFragmentFive(String fragmentFive) {
        this.fragmentFive = fragmentFive;
        String[] parts = secretCode.split("-");
        fragmentFive = parts[4];
    }

    //GETTERS
    public String getSecretCode() {
        return secretCode;
    }

    public String getFragmentOne() {
        return fragmentOne;
    }

    public String getFragmentTwo() {
        return fragmentTwo;
    }

    public String getFragmentThree() {
        return fragmentThree;
    }

    public String getFragmentFour() {
        return fragmentFour;
    }

    public String getFragmentFive() {
        return fragmentFive;
    }
}
