package oop;

public enum Gender {
    MALE("МУЖСКОЙ"), FEMALE("ЖЕНСКИЙ");

    private String gender;
    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender;
    }
}
