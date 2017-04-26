package ch.jug.introduction.kotlin

enum class Superpower(val usefulnessRating: Int) {
    POWER_MANIPULATION(10),
    POWER_DETECTION(5),
    BODY_PART_SUBSTITUTION(6),
    REGENERATIVE_HEALING(7),
    FLIGHT(6),
    SHAPE_SHIFTING(7),
    COMBAT(6)
}

enum class Gender {
    MALE,
    FEMALE,
    ANDROGYNY
}