package variable

//class VariableType {
//
//}
//这是强类型 指定了是int数据类型
int x = 100
//会被包装成Integer
println(x.class)

//弱类型定义一个变量 有点像js 这个是什么类型取决于赋值给他的变量是什么类型
def y=10
println(y.class)
y="Hello World"
println(y.class)

