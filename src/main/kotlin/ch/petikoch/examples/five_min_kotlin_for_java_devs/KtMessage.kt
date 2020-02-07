package ch.petikoch.examples.five_min_kotlin_for_java_devs

data class KtMessage(val text: String) {

    fun textLowerCase(): String {
        return text.toLowerCase()
    }

}