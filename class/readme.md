java常用类

- Arrays
- StringBuilder
- Calendar
- Date
- Math
- System
- Random

Arrays 类：

>用于数组的各种方法。包含静态方法：可将数组转为List

常用方法：

方法 | 描述
-- | --
<T>List<T><T> List<T> asList(T... a) | 返回由指定数组构造的 List
void sort(Object[] a) |	对数组进行排序
void fill(Object[] a, Object val) | 为数组的所有元素都赋上相同的值
boolean equals(Object[] a, Object[] a2) | 检查两个数组是否相等
int binarySearch(Object[] a, Object key) | 对排序后的数组使用二分法查找数据

静态调用：
- `Arrays.fill(arr, 9)`: 将数组arr所有元素都设为9[引用修改]
- `Arrays.toString(arr)`: 将数组arr所有元素输出[需接收返回值]
- `Arrays.binarySearch(arr, 50)`: 搜索有序数组arr中值为50的索引值[需接收返回值]
- `Arrays.copyOf(arr, arr.length)`: 复制数组[需接收返回值]
- `Arrays.equals(arr, newArr)`: 比较两个数组是否相等[需接收返回值]

Random 类：

需实例化对象 `Random random = new Random();`

- `random.nextInt(101)`: 返回100以内的随机整数


StringBuilder 类：

需实例化对象：`StringBuilder s = new StringBuilder();`

- 可变的
- 初始长度为16个字符

常用方法：

方法 | 返回值 | 功能描述
-- | -- | --
insert(int offsetm,Object obj) | StringBuilder | 在 offsetm 的位置插入字符串 obj
append(Object obj) | StringBuilder | 在字符串末尾追加字符串 obj
length() | int | 确定 StringBuilder 对象的长度
setCharAt(int index,char ch) | void | 使用 ch 指定的新值设置 index 指定的位置上的字符
toString() | String | 转换为字符串形式
reverse() | StringBuilder | 反转字符串
delete(int start, int end) | StringBuilder | 删除调用对象中从 start 位置开始直到 end 指定的索引（end-1）位置的字符序列
replace(int start, int end, String str) | StringBuilder | 使用一组字符替换另一组字符。将用替换字符串从 start 指定的位置开始替换，直到 end 指定的位置结束

实例化调用：
- `s.append(" java")`: 在字符串s后追加字符串` java`[修改原字符串并返回]
- `s.insert(1, " love")`：在索引为1的位置插入字符串` love`[修改原字符串并返回]
- `s.length()`：返回s的长度 [需接收返回值]
- `s.setCharAt(0, 'Y')`：将索引为0的字符替换`Y`。[直接修改原字符串,且无返回值]
- `s.replace(7, 11, "PHP!")`：[修改原字符串并返回]
- `s.delete(10,11)`： 删除索引为10-11的元素，不包含索引为11的元素[修改原字符串并返回]
- `s.reverse()`：将字符串s的所有字符反转[修改原字符串并返回]
- `s.toString()`：`StringBuilder`类的`s`转换为`String`类型[修改原字符串并返回]

Calendar (GregorianCalendar) 类：

TimeZone

Date 类：

基本的输出常用格式的时间：
```java
// 格式化时间
Date objDate = new Date();

// 获取当前时间时间戳
long time =  objDate.getTime();
System.out.println("自1970年1月1日起以毫秒为单位的时间（GMT）:"+time);

//格式化时间格式
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
System.out.println(formatter.format(objDate)); // 2020-04-29 06:51:11

```