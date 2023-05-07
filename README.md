设置环境变量
1.增加系统变量"JAVA_HOME",设置为JDK的安装路径(\jdk....)
2.检查是否有Path变量，有则末尾添加"%JAVA_HOME%bin;"，无则创建Path系统变量，在末尾添加路径";%JAVA_HOME%\bin;"
3.编辑系统变量CLASSPATH，值为".;JAVA_HOME%\lib"
4.设置好后DOS命令行输入java-version查看版本信息
5.写好程序后输入javac Hello.java进行编译，再输入java Hello，执行编译得到的文件
