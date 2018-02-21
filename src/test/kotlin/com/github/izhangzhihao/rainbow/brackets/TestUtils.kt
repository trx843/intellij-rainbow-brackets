package com.github.izhangzhihao.rainbow.brackets

import com.github.izhangzhihao.rainbow.brackets.RainbowHighlighter.angleBrackets
import com.github.izhangzhihao.rainbow.brackets.RainbowHighlighter.defaultAngleBracketsColor
import com.github.izhangzhihao.rainbow.brackets.RainbowHighlighter.defaultRoundBracketsColors
import com.github.izhangzhihao.rainbow.brackets.RainbowHighlighter.defaultSquigglyBracketsColors
import com.github.izhangzhihao.rainbow.brackets.RainbowHighlighter.roundBrackets
import com.github.izhangzhihao.rainbow.brackets.RainbowHighlighter.squareBrackets
import com.github.izhangzhihao.rainbow.brackets.RainbowHighlighter.squigglyBrackets

val brackets = roundBrackets + squareBrackets + squigglyBrackets + angleBrackets

fun CharSequence.toChar() = elementAt(0)

fun roundLevel(level: Int) = defaultRoundBracketsColors[level]

fun squigglyLevel(level: Int) = defaultSquigglyBracketsColors[level]

fun angleLevel(level: Int) = defaultAngleBracketsColor[level]