import java.util.*;
class exp5_2 {

public static void main(String args[]) {
int v = 0;
int c = 0;
String str;
Scanner scan = new Scanner(System.in);
System.out.println("Enter a sentence:");
str = scan.nextLine();
count(str);
word(str);
str = str.toLowerCase();
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
v++;
} else if ((ch >= 'a' && ch <= 'z')) {
c++;
}
}
System.out.println("No.of vowels:" + v);
System.out.println("No.of consonants:" + c);
}
public static void count(String x) {
char[] ch = x.toCharArray();
int letter = 0;
int space = 0;
int num = 0;
int symbol = 0;
int i;
for (i = 0; i < x.length(); i++) {
if (Character.isLetter(ch[i])) {
letter++;
} else if (Character.isDigit(ch[i])) {
num++;
} else if (Character.isSpaceChar(ch[i])) {
space++;
} else {
symbol++;
}
}
System.out.println("No. of alphabets:" + letter);
System.out.println("No. of digits:" + num);
System.out.println("No. of special symbols:" + symbol);
System.out.println("No. of blank spaces:" + space);
}
public static void word(String str) {
int word = 0;
char ch[] = new char[str.length()];
for (int i = 0; i < str.length(); i++) {
ch[i] = str.charAt(i);
if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {

word++;
}
}
System.out.println("No.of words:" + word);
}
}