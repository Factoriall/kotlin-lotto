package lotto

enum class LottoRank(val containCount: Int, val money: Int) {
    FIRST(6, 2_000_000_000),
    SECOND(5, 1_500_000),
    THIRD(4, 50_000),
    FOURTH(3, 5_000),
    NONE(0, 0);

    companion object {
        fun of(containCount: Int): LottoRank =
            when (containCount) {
                3 -> FOURTH
                4 -> THIRD
                5 -> SECOND
                6 -> FIRST
                else -> NONE
            }
    }
}
