package pt.josealm3ida.android.chesser.board

/*
class RecyclerViewAdapter(private val mContext : Context) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    private val gridItems : MutableList<Piece> = ArrayList()

    init {
        for (i in 1..64) {
            if (i == 5) {
                gridItems.add(King(Color.WHITE))
                continue
            }

            gridItems.add(EmptyPiece())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mInflater = LayoutInflater.from(mContext)
        //val view = mInflater.inflate(R.layout.cardview_item_square, parent, false)
        //return MyViewHolder(View(parent));
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val line = position / 8
        val colorToUse = if (position % 2 == 0) if (position / 8 % 2 == 0) R.color.black else R.color.white else if (line % 2 == 0) R.color.white else R.color.black

        //holder.gridSquare.setBackgroundColor(mContext.getColor(colorToUse))
        //holder.gridSquare.setImageResource(gridItems[position].drawable)
    }

    override fun getItemCount(): Int {
        return gridItems.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val gridSquare : ImageView = itemView.findViewById(R.id.card_square_imageview)
    }
} */