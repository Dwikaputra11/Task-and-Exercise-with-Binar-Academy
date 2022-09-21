package com.example.roomdatabaseexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabaseexample.MainActivity
import com.example.roomdatabaseexample.databinding.ItemNoteBinding
import com.example.roomdatabaseexample.db.Note
import com.example.roomdatabaseexample.db.NoteDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class NoteAdapter(var noteList: List<Note>):
    RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    private lateinit var listener: OnItemClickListener
    private var dbNote: NoteDatabase? = null

    interface OnItemClickListener{
        fun onItemClick(note: Note)
    }

    fun setOnItemClickListener(listener: OnItemClickListener){
        this.listener = listener
    }

    inner class ViewHolder(var binding: ItemNoteBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            binding.btnDelete.setOnClickListener {
                listener.onItemClick(noteList[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvNoteId.text = noteList[position].id.toString()
        holder.binding.tvNoteTitle.text = noteList[position].title
        holder.binding.btnDelete.setOnClickListener{
            dbNote = NoteDatabase.getInstance(it.context)

            GlobalScope.async {
                val del = dbNote?.noteDao()?.deleteNote(noteList[position])
////                        kalau ga pake ini pas hapus bisa, data ga ke update langsung tapi, ga ada note berhasil atau ga
//                (holder.itemView.context as MainActivity).runOnUiThread {
//                    if ( del != 0){
//                        Toast.makeText(it.context, "Data ${noteList[position].id} Success Deleted", Toast.LENGTH_SHORT).show()
////                                ga pake ini data ga ke update
//                        (holder.itemView.context as MainActivity).getAllNotes()
//                    }else{
//                        Toast.makeText(it.context, "Data ${noteList[position].id} Failed to Delete ", Toast.LENGTH_SHORT).show()
//                    }
                (holder.itemView.context as MainActivity).runOnUiThread{
                    (holder.itemView.context as MainActivity).getAllNotes()
                }
            }

        }

    }

    override fun getItemCount(): Int {
        return noteList.size
    }
}