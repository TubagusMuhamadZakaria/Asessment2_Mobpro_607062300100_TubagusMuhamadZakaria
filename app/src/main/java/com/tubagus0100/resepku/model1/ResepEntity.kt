package com.tubagus0100.resepku.model1

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "resep")
data class ResepEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val judul: String,
    val deskripsi: String,
    val bahan: String,
    val langkah: String
) {
    @Suppress("unused")
    fun getBahanList(): List<String> = bahan.split(";")

    @Suppress("unused")
    fun getLangkahList(): List<String> = langkah.split(";")
}
