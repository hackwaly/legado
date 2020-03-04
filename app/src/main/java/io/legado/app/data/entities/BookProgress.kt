package io.legado.app.data.entities

data class BookProgress(
    val bookUrl: String,
    val durChapterIndex: Int,
    val durChapterPos: Int,
    val durChapterTime: Int,
    val durChapterTitle: String?
)