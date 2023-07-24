package Package

object q1 {
  def main(args: Array[String]): Unit = {
    val plainText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val shiftValue = 3
    println("Plain text     : " + plainText)

    val outputEncryption = caesarCipher(plainText, shiftValue, "encryption");
    println("Encrypted text : " + outputEncryption)

    val outputDecryption = caesarCipher(outputEncryption, shiftValue, "decryption");
    println("Decrypted text : " + outputDecryption)
  }

  def encryption(text: String, shift: Int): String = {
    val encryptedText = text.map { char =>
      if(char.isLetter) {
        val base = if(char.isUpper) 'A' else 'a'
        val charNumber = char.toInt - base
        val shiftedCharNumber = (charNumber + shift) % 26
        val newChar = (shiftedCharNumber + base).toChar
        newChar
      }
      else {
        char
      }
    }
    encryptedText
  }

  def decryption(encrypted_text: String, shift: Int): String = {
    encryption(encrypted_text, 26-shift)
  }

  def caesarCipher(input_text: String, shift: Int, mode: String): String = mode match{
    case mode if (mode == "encryption")   => encryption(input_text, shift)
    case mode if (mode == "decryption")   => decryption(input_text, shift)
    case _                                => println("Invalid mode") ; input_text
  }
}

