
/**
 * [1]Java code
 */
//package ;
class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld! I'm CF...");
		// 老子要测试	
} 

/**
 * [2]C code
 */
#include <stdio.h>
int main()
{
	printf("HelloWorld! I'm CF...");
	return 1;
}

/**
 * [3]C++ code
 */
#include <iostream>
#include <stdio.h>
int main()
{
	printf("HelloWorld!");
	puts("HelloWorld!");
	std::cout << "HelloWorld!" << std::endl;
	return 1;
}

/**
 * [4]Python code
 */
print "HelloWorld! I'm CF..."	#python 2.x
print("HelloWorld! I'm CF...")	#python 3.x

/**
 * [5]C# code
 */
using System;
class HelloWorldCSharp 
{
	public static void Main()
	{
		Console.WriteLine("HelloWorld! I'm CF...");
		Console.ReadKey();
	}
}

/**
 * [6]PHP code
 */
<!DOCTYPE html>  
	<body>  
		<?php  
			echo "Hello,World!";            //打印语句    
			echo phpinfo();                 //phpinfo()系统函数,输出环境信息  
		?>  
	</body>  
</html>

/**
 * [7]JavaScript code
 */
var sys = require("sys");	#导入sys模块
sys.puts("HelloWorld! I'm CF...");

/**
 * [8]Ruby code
 */
print "HelloWorld!\n"
puts "HelloWorld!\n"

/**
 * [9]R code
 */
print("HelloWorld! I'm CF...")

/**
 * [10]SQL code
 */
CREATE TABLE MESSAGE (TEXT CHAR(15));            #创建表  
INSERT INTO MESSAGE (TEXT) VALUES ('Hello, world!');  #插入表  
SELECT TEXT FROM MESSAGE;                             #查询表  
DROP TABLE MESSAGE;                                   #删除表               

/**
 * [11]Perl code
 */
#!C:\Perl\bin		#Windows平台
#!/usr/bin/env perl	#Linux平台
print "HelloWorld! I'm CF..."
#Perl 版本5.10及以上
use 5.010;
say "HelloWorld!";

/**
 * [12]HTML code
 */
<!DOCTYPE html>  
	<html>  
		<body>  
			<h1>This is the first program!</h1>  
			<p>HelloWorld!</p>  
		</body>  
	</html>

/**
 * [13]VB code
 */
Module HelloWorld						'模块起始
	Sub Main()							'程序入口函数
		MsgBox("HelloWorld! I'm CF...")	'计算机屏幕显示信息
	End Sub								'程序结尾
End Module								'模块结尾

/**
 * [14]Scala code
 */
object HelloWorld
{
	def main(args:Array[String])
	{
		println("HelloWorld! I'm CF...");
	}
}

/**
 * [15]Shell code
 */
#安装了MinGW和MSYS的Windows平台
echo "HelloWorld!"
#Linux平台
printf "HelloWorld!"
#代码写在文件中
chmod +x HelloWorld.sh
./HelloWorld.sh

/**
 * [16]Delphi code
 */
procedure HelloWorld.Button1Click(Sender: TObject);  
begin  
	label1.Caption := 'HelloWorld!';  
end;  
  
procedure HelloWorld.FormCreate(Sender: TObject);  
begin  
  
end;  
  
end.

/**
 * [17]Fortran code
 */
program HelloWorld
	print *, "HelloWorld!"
end program HelloWorld

/**
 * [18]TCL code
 */
#命令行交互方式
% puts "HelloWorld!"
% exit
#文件运行方式
#!usr/local/bin/tcl
puts "HelloWorld!"

X:\>TCLSH HelloWorld.tcl

/**
 * [19]FoxPro code
 */
? "HelloWorld!"

/**
 * [20]Ada code
 */
with TEXT_IO;
procrdure HELLOWORLD is
begin
	TEXT_IO.PUT_LINE("HelloWorld!");
end HELLOWORLD;

/**
 * [21]AWK code
 */
[root@Linux]#echo | awk '{print "HelloWorld!"}'
[root@<span style="font-family: SimHei; font-size: 14px;">Linux</span>
<span style="font-size: 14px; font-family: SimHei;"> ~]# echo | awk 'BEGIN {print "HelloWorld!"}'</span>    
[root@Linux ~]# awk 'BEGIN {print "HelloWorld!"}'  
[root@Linux ~]# echo "HelloWorld!" | awk '{print}'

/**
 * [22]Sed code
 */
# sed -ne 'ls/.*/HelloWorld!/p'

/**
 * [23]Pascal code
 */
Program HelloWorld(output);
begin
	writeln('HelloWorld!');
end.

/**
 * [24]Prolog code
 */
write("HelloWorld!").
