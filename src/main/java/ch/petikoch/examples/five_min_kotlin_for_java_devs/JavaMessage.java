package ch.petikoch.examples.five_min_kotlin_for_java_devs;

public record JavaMessage(String text) {

    String textLowerCase() {
        return text.toLowerCase();
    }
}
