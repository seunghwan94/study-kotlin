## Kotlin

### Default

#### Variable
- var
- val
#### Any
- var value:Any == type 지정
#### if / when / function
```
if( ){ } else(){ }

var result = when(boolean) {        // == switch
  "월","화","수","목","금" -> "평일"
  "토","일" -> "주말"
  else -> "몰라"                    // == default
}

fun getGrade(score:Int): String = when(score){
    in 90..100 -> "A"
    in 80..89 -> "B"
    else -> "C"
}

// 타입 확인
when(value){
  is String -> "String"
  is Char -> "Char"
  is Double -> "Double"
  else -> "unkown"
}

when {
  num % 2 == 1 -> "odd"
  num % 2 == 0 -> "even"
  else -> "unkown"
}
```
### for / while
```
for (x in 1..9)
  print("${x}")
```

### list
```
java
  new ArrayList(Stream.of(...).toList()) >> immutable List

kotlin
  mutableListOf(1,2,3,"ac")

val numbers1 = arrayOf(1,2,3,4,5) // 값들을 알고있을 때 사용
val numbers2 = Array(5){ 0 }      // 값들을 모를때 사용
val numbers3 = intArrayOf(5)      // 기본 자료형 대상 List 만들기

numbers1[2]
numbers2.joinToString()
numbers3.size

numbers1.sortedArray().joinToString()
for ((i, value) in numbers.withIndex())
numbers2.map{i -> i * i} // []
numbers2.map{i -> i * i}.toIntArray() // {}
numbers3.forEach{i -> print(i)}
```

### Class
```
// 생성자 있는 경우
class ClazzIn(var key:String,var val:Int)
val key = ClazzIn("first", 1)

// 생성자 없는 경우
open class ClazzOut{
  var key:String = ""
  var val:Int = 0

  // 초기화 블록
  init {
  }

  // 기본 생성자
  constructor(key:String, val:Int){
    this.key = key
    this.val = val
  } 

  fun info(){
    println("key : ${key}, val : ${val}")
  }
}
val out = ClazzOut("key",3)
out.info()

// 데이터 가져올때 사용 (== DTO라 생각해라)
data class ClazzData(key:String, val:Int)

// Singleton
object Obj { var c = 0; }
Obj.c++
```

### elvis operator
null인 경우 Default 값 지정 (Null Point Expection 방지)
```
val l:Int  = b != null ? b.length : -1
val l = b?.length ?: -1
```

### Lamba function
```
// 기본 function
val a = fun() { }

// 반환 타입이 없어서 Unit이 있어야 한다.
val a : () -> Unit = { }

// return 존재 할 경우
val a : (Int) -> Int = {it * it}
val a : (Int, Int) -> Int = {a, b -> a + b}
```

### View
- TextView
- EditText
- Button
- ImageView
- CheckBox
- RadioButton
- ...
### Layout
- LinearLayout
- FrameLayout
- TableLayout
- ConstraintLayout
- ...

