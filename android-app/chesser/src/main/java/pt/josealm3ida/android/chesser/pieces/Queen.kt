package pt.josealm3ida.android.chesser.pieces

import pt.josealm3ida.android.chesser.R

class Queen(override val color: Color) : Piece {
    companion object {
        const val FIGURINE_WHITE = '♕';
        const val FIGURINE_BLACK = '♛';

        const val DRAWABLE_WHITE = R.drawable.ic_queen_white
        const val DRAWABLE_BLACK = R.drawable.ic_queen_black
    }

    override val figurine: Char = if (color == Color.WHITE) FIGURINE_WHITE else FIGURINE_BLACK
    override val drawable : Int = if (color == Color.WHITE) DRAWABLE_WHITE else DRAWABLE_BLACK

}