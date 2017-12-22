************学习笔记************
****** @date  2017年7月4号  @location 帝都用友软件园   @author 杨路生******
						Notes of Java Learning
JULY
7.4
	1.Repository 仓库，储藏库；portal 入门
	2.基类等于父类，派生类等于子类
	3.网络计算机Network computer缩写NC，但是用友的NC指的是以前的项目
7.5
	0.donate 捐献; tortoise 乌龟; 行动迟缓的人（或物）; annotation 注释
	screencast 截屏视频; 屏播; 录屏软件;merge  融入 redistribute 再分配
	Gist 在github中表示“代码片段” fork 代表复制  pull request 请求；issue 问题
	Repositories contributed to（做过贡献的库）Contribution activity（贡献过的活动）
	Pulse 最近仓库的活动信息  specify 指定

	github里面老外的简写
	/*1.AFAIK: As far as I know.  据我所知
2.SPOF: Single point of failure。 单节点崩溃
3.ASAP: As soon as possible。 马上，尽快。
4.BTW: By the way。 顺便说一下
5.FYI : For your information。 供你参考
6.TTYL: Talk to you later 。 待会回复你
7.Plz: Please 的谐音，基本用在熟人之间，而且是上级对下级，或者平级。 别给上级这么用，除非你和他非常非常熟...
8.Thx: Thanks.  这个就无所谓了， 伸手不打笑脸人， 经常说谢谢，百利无一害。
9.U: you
10.R: are.  经常用于where R U？  邮件里面用的不太多，大多数用在非正式场合之中。 例如wechat..
11.Wanna:  want to。 这个既不是谐音，也不是缩写， 所以有些特殊。 这个基本就属于约定俗成，表示想做什么。 
12.Pvt: private. 经常用在表示所有权上面，比如说私有库，或者私有代码。
13.Doc: Document. 经常看到这三个字母，在开发界就表示文档。 如果用在其它场合，也可能表示医生。 所以需要结合上下文来判断
14.PR: Pull request. 合并请求。 github上面使用量非常大的两个字母
15.i.e. 也就是...    
16.e.g. 例如， 举例来说
17.etc. 等等*/

	1.1、git有且只有一个，就是linus最初创建的那个叫做git的程序。
	1.2、最初的git，只能运行在*nix系统上，然后，有人为它做了windows兼容的修改，
	git for windows的具体维护工作应该是德国的一家公司的几个人在负责，也就是msysgit。
	msysgit本身，也是git官方维护的版本，它的release是跟着git主版本走的，
	但是因为有一些windows特有的修改不便merge到主干。
	1.3、tortoisegit为了提高性能，在将内部实现从调用git的cmd命令转移到一个gitlib的dll上去，
	这个gitlib的dll的跟msysgit有大部分相同之处。
	总结：git本身就是git，然后github for windows和tortoisegit都是git的一个gui包装。使用tortoisegit，
	需要单独下载msysgit安装，使用github for windows，可以直接使用内置的msysgit而无须单独下载安装
	
	2.微软Windows Installer作为Win2K/WinXP/WinVista的组件之一，是专门用来管理和配置软件服务的工具。
在Win95、Win98、WinMe与WinNT4.0下，作为额外的产品提供，允许用户有效地安装与配置软件产品与应用程序。
新的Installer提供给软件产品新的特性，例如使用命令行安装产品、增加了用户的可定制性
	3.开始--运行--cmd(回车)--systeminfo(回车)
所有关于操作系统的信息就都出来了
查看Windows installer版本
开始--运行--msiexec(回车)就能看到了
	3.SSH 为 Secure Shell 的缩写.通过ssh登录远程服务器时，使用密码认证，分别输入用户名和密码，两者满足一定规则就可以登录
所谓的公钥认证，实际上是使用一对加密字符串，一个称为公钥(public key)，任何人都可以看到其内容，用于加密；
另一个称为密钥(private key)，只有拥有者才能看到，用于解密。通过公钥加密过的密文使用密钥可以轻松解密，
但根据公钥来猜测密钥却十分困难。
RSA是公钥加密算法
	4.Windows 7的用户文件夹默认位置是系统盘的“\Users”目录。该文件夹中储存着所有的用户生成文件，
比如保存在“桌面”上的文件（实际上是保存在C:\Users\UserName\Desktop目录中），
再如保存在“我的文档”里的文件（实际上是保存在C:\Users\UserName\Documents目录中）。
在资源管理器的地址栏里输入“%AppData%”之后回车，就可以看到有多少软件把用户生成数据保存在那里。
	5.passphrase和 passcode都是password的一种，只不过passphrase是满足了一定规则约束的password,
 安全性要高一些； passcode指由纯数字组成的password.
	6.SVN是Subversion的简称，是一个开放源代码的版本控制系统，相较于RCS、CVS，它采用了分支管理系统，
	它的设计目标就是取代CVS。
	7.Maven项目对象模型(POM)，可以通过一小段描述信息来管理项目的构建，报告和文档的软件项目管理工具。
	8.在64位系统下，为了更好的兼容32位程序，在安装一些32位程序（注意某些程序他就是32位的），
	会默认扔到program files(x86)这个文件夹下，而一些64位的程序，或程序本身没有位数区别的，
	会默认扔到program files这个文件夹下
	9.Windows Server 2003是微软基于Windows XP/NT5.1开发的服务器操作系统
	10.位异或 ^的特点：一个数据对另一个数据位异或两次，该数本身不变。
	11.键盘录入
	 import java.util.Scanner; 
	  Scanner sc = new Scanner(System.in);
	  int x = sc.nextInt();
	  数组定义格式
	  动态初始化
	  数据类型[] 数组名 = new 数据类型[数组的长度];
	  静态初始化
	  数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
          数据类型[] 数组名 = {元素1,元素2,…};
	  数组的属性:arr.length数组的长度
	   int[][] arr = new int[3][2]; 
	   数据类型[] 数组名[] = new 数据类型[m][n];

	  静态变量存储于方法区的静态区
	  成员变量存储于堆内存
	  构造代码块不是构造方法，而且它在构造方法之前执行的
	  子类不能继承父类的构造方法，但是可以通过super关键字去访问父类构造方法。
	  super(…)或者this(….)必须出现在构造方法的第一条语句上

	12.Maven项目的结构和内容在一个XML文件中声明，pom.xml 项目对象模型（POM），这是整个Maven系统的基本单元。


7.6
	0. credentials 凭证，证件 overlay 覆盖
	1.War包一般是在进行Web开发时，通常是一个网站Project下的所有源码的集合，里面包含前台HTML/CSS/js的代码
	也包含Java的代码。
	当开发人员在自己的开发机器上调试所有代码并通过后，为了交给测试人员测试和未来进行产品发布，
	都需要将开发人员的源码打包成War进行发布。War包可以放在Tomcat下的webapps或者word目录下，
	随着tomcat服务器的启动，它可以自动被解压。
	2.Redis是一个开源的使用ANSI C语言编写、支持网络、可基于内存亦可持久化的日志型、Key-Value数据库，
	并提供多种语言的API。从2010年3月15日起，Redis的开发工作由VMware主持。从2013年5月开始，Redis的开发由Pivotal赞助。
	3.序列化： 将数据结构或对象转换成二进制串的过程
反序列化：将在序列化过程中所生成的二进制串转换成数据结构或者对象的过程

7.7	
	0.toggle 转换 autowired 注解  verbose 详细信息 deactivate 使不活动，使无效  async 异步的
		deprecated 反对，不赞成   mapping 映射
	1.在Java中有两类线程：User Thread(用户线程)、Daemon Thread(守护线程) 
	 Daemon的作用是为其他线程的运行提供服务，比如说GC线程。
	 其实User Thread线程和Daemon Thread守护线程本质上来说去没啥区别的，
	 唯一的区别之处就在虚拟机的离开：如果User Thread全部撤离，那么Daemon Thread也就没啥线程好服务的了，
	 所以虚拟机也就退出了。
	2.如果两段代码是同步的, 那么同一时间只能执行一段, 在一段代码没执行结束之前, 不会执行另外一段代码.
	3.sleep()不释放同步锁,wait()释放同步锁
	4.这里有这样一段建议（c++的）：
After you mark the methods as static, the compiler will emit non-virtual call sites to these members.
Emitting non-virtual call sites will prevent a check at runtime for each call that ensures
that the current object pointer is non-null. This can result in a measurable performance gain for performance-sensitive code. 
In some cases, the failure to access the current object instance represents a correctness issue.
意思就是说，编译器对标记为静态的函数无需检测this指针是否为空，有时候这样的检测会对性能敏感的应用产生影响。
说的比较笼统，其实原因是对非静态函数来说，都会默认传递第一个this参数，就是this地址，调用的时候会首先压入栈；
如果是静态函数，this指针的入栈这一步就免了。
	

7.5
	0.
	archetype 原型，模型
	1.
	binary tar.gz 可以理解为用的真实maven工具。
	而source tar.gz是maven的源码，供学习使用的
	2.
	结论：以后配置环境变量，HOME就是HOME，是大本营的意思，不要把HOME配置得过细！
	把bin这个词儿放在path里面写，不要写在HOME里！

	同时最后面不要有\
	如JAVA_HOME最后面就不要有\，因为引用该环境变量时候在加上\就有两个\\导致错误产生

7.6	
	0.phase 阶段 inception 开始，开端 surefire adj.万全，一定成功的

7.10	
	0.snippet 小片，片段  inception 开始，开端
	1.域英文叫DOMAIN——域(Domain)是Windows网络中独立运行的单位，
	域之间相互访问则需要建立信任关系(即Trust Relation)。信任关系是连接在域与域之间的桥梁。
	当一个域与其他域建立了信任关系后，2个域之间不但可以按需要相互进行管理，
	还可以跨网分配文件和打印机等设备资源，使不同的域之间实现网络资源的共享与管理。
	2.XMLHttpRequest 对象。也就是ajax功能实现所依赖的对象。
	XMLHttpRequest 对象提供了对 HTTP 协议的完全的访问，
	包括做出 POST 和 HEAD 请求以及普通的 GET 请求的能力。

7.11	
	0.
	1.事务，一般是指要做的或所做的事情。在计算机术语中是指
	访问并可能更新数据库中各种数据项的一个程序执行单元(unit)。
	2.DAO(Data Access Object) 数据访问对象是一个面向对象的数据库接口
	3.spring通过“控制反转”实现了“依赖注入”。所谓的注入，我的理解是程序实现就像盖房子，
	spring允许你在类（class）里搭个框架，在配置文件中注明在什么地方用什么材料，
	在运行时spring按照你的配置真正向这个架子里“注入”了水泥、钢筋等等。

	如果代码里到处都有new XXX，那你的代码是和实现类耦合的。用Spring注入，
	我们可以只依赖接口，这对日后修改或替换实现类都有好处。Spring最主要是让代码和实现解藕，
	具体依赖让调用方决定，从而获得最大的价值。
	4.Spring对应的关键词是DI（依赖注入）与AOP（面向切面编程）

7.12	
	0.dashboard 仪表盘，控制盘  milestone 里程碑  token 象征，记号，在计算机身份认证中是令牌（临时）的意思
	audit 审计，查账  avatar 头像 LDAP是轻量目录访问协议，英文全称是
	Lightweight Directory Access Protocol  Skype 网络电话 linkedin 商务化人际关系网
	bio 个人简历(biography的缩写);  redirect 重定向  OAuth: OAuth(开放授权)
	Expires at 到期  inactive 闲置的  notification email 电子邮件通知
	qualifying 使具有资格的   patch 补丁 collable 可随时支取的
	verify 核实  mock 模仿的，仿制的 ，嘲笑   suppress 镇压，压制
	1.创建应用对象之间协作关系的行为被称为装配（wiring），这也是依赖对象注入的本质。 
	而不是实例化对象的过程    hint 暗示   artifact 人工制品 deflate 放弃，紧缩
	Powered by 技术支持   facets 方面   nesting 嵌套 exclusion 拒绝  filter 过滤
	2.标注类中：
	@Service用于标注业务层组件，@Controller用于标注控制层组件（如struts中的action）,
	@Repository用于标注数据访问组件，即DAO组件，而@Component泛指组件，当组件不好归类的时候，
	我们可以使用这个注解进行标注。
	标注属性、方法 @Autowired和@Resource:
 
@Autowired 与@Resource 都可以用来装配bean.  都可以写在字段上,或写在set方法上

@Autowired (spring提供的) 默认按类型装配

@Resource ( j2ee提供的 ) 默认按名称装配,当找不到(不写name属性)名称匹配的bean再按类型装配.
可以通过@Resource(name="beanName") 指定被注入的bean的名称, 要是指定了name属性, 就用 字段名 去做name属性值,一般不用写name属性.
@Resource(name="beanName")指定了name属性,按名称注入但没找到bean, 就不会再按类型装配了.
还有个比较重要的一点是@Resource不是单例的，而@Autowired则是单例的。
	3. @return  一种java注解，一般写在方法的上面，说明该方法有返回值。
	只是起到一个说明作用。这个在生成javadoc的时候有用
	4.JSON(JavaScript Object Notation, JS 对象标记) 是一种轻量级的数据交换格式。
	JSON 是 JS 对象的字符串表示法，它使用文本表示一个 JS 对象的信息，本质是一个字符串。
	5.在Java当中，如果有一个类专门用来存放其它类的对象，这个类就叫做容器，或者就叫做集合，
	集合就是将若干性质相同或相近的类对象组合在一起而形成的一个整体 
	6.moudle与module辨析。两个单词都有“模块”的意思，但多用module这个单词，
	moudle现在已基本没人使用、在电子行业有时会见到。
	7. @Controller”,表明某类是一个controller
	@RequestMapping”请求路径映射，如果标注在某个controller的类级别上，
	则表明访问此类路径下的方法都要加上其配置的路径；最常用是标注在方法上，
	表明哪个具体的方法来接受处理某次请求。
	8.官方文档：
@RestController is a stereotype annotation that combines @ResponseBody and @Controller.
意思是：
@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用

@responseBody注解的作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，
写入到response对象的body区，通常用来返回JSON数据或者是XML
数据，需要注意的呢，在使用此注解之后不会再走试图处理器，而是直接将数据写入到输入流中，
他的效果等同于通过response对象输出指定格式的数据。
	9. @Retention(保留)注解说明,这种类型的注解会被保留到那个阶段. 有三个值。
	@Documented 注解表明这个注解应该被 javadoc工具记录. 默认情况下,javadoc是不包括注解的. 
	@Target说明了Annotation所修饰的对象范围 如：ElementType.PARAMETER:用于描述参数 
	10.“用户配置文件”是Profile这个词的直接翻译，其实没有文件的意思，
	默认存储在数据库中，不用自己管理文件。 
	11. @Aspect的意思是面向切面编程，一个类前面加上@Aspect说明这个类使用了这个技术
	@Pointcut 是指那些方法需要被执行"AOP",是由"Pointcut Expression"来描述的.
	@Before是在所拦截方法执行之前执行一段逻辑。
	@After 是在所拦截方法执行之后执行一段逻辑。
	@Around是可以同时在所拦截方法的前后执行一段逻辑。
	12.AOP（Aspect Oriented Program）:这种在运行时，动态地将代码切入到类的指定方法、
	指定位置上的编程思想就是面向切面的编程。
	一般而言，我们管切入到指定类指定方法的代码片段称为切面，而切入到哪些类、哪些方法则叫切入点。
	有了AOP，我们就可以把几个类共有的代码，抽取到一个切片中，等到需要时再切入对象中去，
	从而改变其原有的行为。这样看来，AOP其实只是OOP的补充而已。OOP从横向上区分出一个个的类来，
	而AOP则从纵向上向对象中加入特定的代码。有了AOP，OOP变得立体了。如果加上时间维度，
	AOP使OOP由原来的二维变为三维了，由平面变成立体了。从技术上来说，AOP基本上是通过代理机制实现的。
	13.由于一个应用程序可能需要启动多个进程。所以在同等情况下，进程的数 量要比程序多的多。
	14.进程与程序的主要区别：
 （1）程序是永存的；进程是暂时的，是程序在数据集上的一次执行，有创建有撤销，存在是暂时的；
 （2）程序是静态的观念，进程是动态的观念；
 （3）进程具有并发性，而程序没有；
 （4）进程是竞争计算机资源的基本单位，程序不是。
 （5）进程和程序不是一一对应的： 一个程序可对应多个进程即多个进程可执行同一程序；
   一个进程可以执行一个或几个程序
	15.一个进程可以占用多个端口号
	16.  @Inject注解和Spring的@Autoware注解都是根据类型对其进行自动装配
	17.可以用Guava的VisibleForTesting测试私有方法
	Annotates a program element that exists, or is more widely visible than otherwise necessary,
	only for use in test code.
从字面上可以被这样理解： 注释一个已经存在的程序元素或者所注释的元素被给于它所必须的更宽松的 可见性，
仅仅被使用在测试代码中。
	18.jQuery是一个快速、简洁的JavaScript框架，是继Prototype之后又一个优秀的JavaScript代码库
	（或JavaScript框架）。jQuery设计的宗旨是“write Less，Do More”，即倡导写更少的代码，
	做更多的事情。它封装JavaScript常用的功能代码，提供一种简便的JavaScript设计模式，
	优化HTML文档操作、事件处理、动画设计和Ajax交互。
	19.Google Guice提供了一个名为@Singleton的注解，只要在类上加上这个注解，
	就可以实现一个单例类，不需要自己手动编写单例实现类。@Named注解提供了为属性赋值的功能。
	20.Guice是Google开发的一个轻量级，基于Java5（主要运用泛型与注释特性）的依赖注入框架(IOC)。
	21.J2SE 提供的最后一个批注是 @SuppressWarnings。该批注的作用是给编译器一条指令，
	告诉它对被批注的代码元素内部的某些警告保持静默。 
	22.类加载器的作用就是在运行时加载类
	23.Gradle是一个基于Apache Ant和Apache Maven概念的项目自动化构建工具。
	它使用一种基于Groovy的特定领域语言(DSL)来声明项目设置，抛弃了基于XML的各种繁琐配置。
	24.预共享密钥模式（pre-shared key，PSK， 又称为个人模式）是设计给负担不起 
	802.1X 验证服务器的成本和复杂度的家庭和小型公司网络用的，每一个使用者必须输入密语来取用网络，
	而密语可以是 8 到 63 个ASCII字符、或是 64 个16位数字（256位元）。
	25.网段（network segment）一般指一个计算机网络中使用同一物理层设备（传输介质，中继器，集线器等）
	能够直接通讯的那一部分。例如，从192.168.0.1到192.168.255.255这之间就是一个网段。
	在同一网段，要求网络标识相同。网络标识就是用IP的二进制与子网掩码的二进制数据作'与'运算
	26.source folder（可多个）:存放java源代码的文件夹,当然也包括一些package文件夹,还可以包含其他文件.  
项目构建后,source folder里面的java自动编译成class文件到相应的/web-inf/classes文件夹中,
其他文件也会移到/web-inf/classes相应的目录下.  
package下除了java文件也可以包含其他文件，而且编译、打包后的文件路径与source folder下的文件路径有一样规则
1.sourceFolder靠"/"来进行上下级划分，package靠“.”来进行上下级划分。
  2.source folder下能建package,而package下不能建source folder
  3.java文件中的package属性是按package路径来进行赋值的，source folder路径不参与java文件的package属性赋值，
  再由第二条不同得到结论，所有source folder下的java文件package属性都为空。
folder:里面可以放入任何文件.包括java源文件,jar文件,其他文件(例如,图片,声音等).在此我说明一下,
如果里面含有java源文件,不管程序是否正确,eclipse都不会报错,把它们当做普通文件处理.
但是项目如果要使用这里面的文件,情况就不同了. 


7.13
	0.administrator 管理员 administer v. 管理 No qualifying bean of type  没有限定类型的bean
	cannot be resolved to a type 无法解析为类型  trial 试验
	collate 核对   hibernate 冬眠，蛰伏  render 给予，使成为
	scroll lock （滚动锁定键） pin console锁定控制台,同时运行多个程序的时候控制台不会自动切换
	1.MIME(Multipurpose Internet Mail Extensions)多用途互联网邮件扩展类型。
	是设定某种扩展名的文件用一种应用程序来打开的方式类型，当该扩展名文件被访问的时候，
	浏览器会自动使用指定应用程序来打开。
	2.GMT  Greenwich Mean Time 格林尼治标准时间;
	3.servletContext可以理解为服务器端的一个共享空间，它可以被所有的客户端访问。
	基于这种特性，我们就可以利用servletContext做计数器等应用。
我们用个图来描述cookie、session、servletContext的区别.
区别在于session是局部的,servletContext是共享的.当换了另一个窗口开始访问又从0开始计数,
而servletContext则是接下去计数.ServletContext中的属性的生命周期从创建开始，到服务器关闭而结束
	4.小心：Port 和PID不是同一个东西
	5.Ajax：（Asynchronous JavaScript And XML）指异步 JavaScript 及 XML
	6.Javaweb中的过滤器可以拦截所有访问web资源的请求或响应操作
	7.类加载器：作用：负责把磁盘上的class文件加载到JVM中，Class引用字节码
	8. Tomcat默认可以使用的内存为128MB，在较大型的应用项目中，这点内存是不够的，需要调大。


************学习笔记************
****** @date  2017年7月14号  @location 帝都用友软件园   @author 杨路生******

7.14
	0.
	1.在XHR诞生前，网页要获取客户端和服务器的任何状态更新，都需要刷新一次，
	在XHR诞生后就可以完全通过JS代码异步实现这一过程。XHR的诞生也使最初的网页制作转换为开发交互应用，
	拉开了WEB2.0的序幕。 XHR是一种浏览器API，极大简化了异步通信的过程，开发者并不需要关注底层的实现，
	因为浏览器会为我们完成这些工作，如连接管理、协议协商、HTTP请求格式化等等。


7.15
	0.collapse 折叠
	1.Readonly和Disabled是用在表单中的两个属性，它们都能够做到使用户不能够更改表单域中的内容。
	但是它们之间有着微小的差别，总结如下：Readonly只针对input(text / password)和textarea有效，
	而disabled对于所有的表单元素都有效，包括select, radio, checkbox, button等。
但是表单元素在使用了disabled后，当我们将表单以POST或GET的方式提交的话，这个元素的值不会被传递出去，
而readonly会将该值传递出去（这种情况出现在我们将某个表单中的textarea元素设置为disabled或readonly，
但是submit button却是可以使用的）。
	2.FRAMESET 元素是 FRAME 元素的容器。HTML 文档可包含 FRAMESET 元素或 BODY 元素之一，而不能同时包含两者。

7.16
	0.
	1.float是魔鬼，会影响其他相邻元素；但是clear是小白，其只会影响自身，不会对其他相邻元素造成影响！

7.17	
	0.pending 即将发生的(此种状态显示有可能是广告拦截如adblock导致的) Latency 延迟时间（是从请求开始到接收到第一个字节的时间），潜伏
	  parser 剖析器   throttling 限流控制   Provisional暂时地，临时的  downgrade贬低，低估
	  public exponent 公开指数   realm 领域，范围
	1.Model层就是对应的数据库表的实体类。
	Dao层是使用了hibernate连接数据库、操作数据库（增删改查）。
	Service层：引用对应的Dao数据库操作，在这里可以编写自己需要的代码（比如简单的判断）。
	Action层：引用对应的Service层，在这里结合Struts的配置文件，跳转到指定的页面，
	当然也能接受页面传递的请求数据，也可以做些计算处理。以上的Hibernate，Struts，
	都需要注入到spring的配置文件中，Spring把这些联系起来，成为一个整体。
	2.“业务”更白话一些来说，就是各行业中需要处理的事务
	3.DOM 断点（DOM Breakpoints）可以监听某个 DOM 被修改情况
	4.XPath 是一门在 XML 文档中查找信息的语言。XPath 用于在 XML 文档中通过元素和属性进行导航
	5. localhost 是一个域名，在过去它指向 127.0.0.1 这个IP地址。在操作系统支持 ipv6 后，
	它同时还指向ipv6 的地址 [::1]
	localhost 是个域名，不是地址，它可以被配置为任意的 IP 地址，不过通常情况下都指向 127.0.0.1(ipv4)和 [::1](ipv6)
	6.谷歌浏览器开发者选项Network里面Name ：资源的名称和url；图中"regex"选择框勾选可支持正则匹配。
	Preview：预览面板，用于资源的预览  Initiator 发起程序
	7.JSON：JavaScript 对象表示法（JavaScript Object Notation）。
JSON 是存储和交换文本信息的语法。类似 XML。
JSON 比 XML 更小、更快，更易解析。
	8. eclipse中如何查询一个类的继承关系。
	方法一：ctrl+shift+H 输入类名 
    方法二：点选类名 按 F4 
	9.ctrl+o 按一次是当前类的字段与方法 再按一次显示继承自父类的字段与方法
	10.CDN的全称是Content Delivery Network，即内容分发网络。
	其基本思路是尽可能避开互联网上有可能影响数据传输速度和稳定性的瓶颈和环节，使内容传输的更快、更稳定。
	通过在网络各处放置节点服务器所构成的在现有的互联网基础之上的一层智能虚拟网络，
	CDN系统能够实时地根据网络流量和各节点的连接、负载状况以及到用户的距离和响应时间等综合信息将用户的请求
	重新导向离用户最近的服务节点上。其目的是使用户可就近取得所需内容，解决 Internet网络拥挤的状况，
	提高用户访问网站的响应速度。
	11.当浏览器向web服务器发送请求的时候，一般会带上Referer，告诉服务器我是从哪个页面链接过来的
	12.Transfer-Encoding: chunked 表示输出的内容长度不能确定，普通的静态页面、图片之类的基本上都用不到这个。
但动态页面就有可能会用到  chunked 分块
	13.新的 Referrer Policy，我们可以针对第三方网站隐藏 Referrer
	referrer policy 有许多选项，如
	No Referrer：任何情况下都不发送 Referrer 信息；
No Referrer When Downgrade：仅当发生协议降级
（如 HTTPS 页面引入 HTTP 资源，从 HTTPS 页面跳到 HTTP 等）时不发送 Referrer 信息。
这个规则是现在大部分浏览器默认所采用的；
	14.TTL是 Time To Live的缩写，该字段指定IP包被路由器丢弃之前允许通过的最大网段数量。
	表示一个数据包从出发开始一共可以被中转多少次（路由器和服务器）
	TTL是IPv4包头的一个8 bit字段。
	15.bogon是指那些不该出现在internet路由表中的地址(私有地址，或者还未分配出去的)

7.18		
	0. QUIC (Quick UDP Internet Connections) protocol   drop-down menu 下拉菜单
	aliases 别名  encrypt 加密  pseudo 假的，虚伪的 pseudo-elements  伪元素
	dock 停靠
	dock to main Window 停靠主窗口
	1.XHR类型即通过XMLHttpRequest方法发送的请求
	2.tomcat每次启动时，自动在logs目录下生产以下日志文件，按照日期自动备份

  localhost.2016-07-05.txt   //经常用到的文件之一 ，程序异常没有被捕获的时候抛出的地方

  catalina.2016-07-05.txt  //经常用到的文件之一，程序的输出，tomcat的日志输出等等

  manager.2016-07-05.txt //估计是manager项目专有的

  host-manager.2016-07-05.txt//估计是manager项目专有的

  localhost_access_log.2016-10-01.txt //tomcat访问日志记录，需要配置
	3.Web项目中的JAVA文件是tomcat服务器来触发的，但是java项目里的是main()方法来开始的
	4.NIO（Non-blocking I/O，在Java领域，也称为New I/O），是一种同步非阻塞的I/O模型，也是I/O多路复用的基础，
	已经被越来越多地应用到大型应用服务器，成为解决高并发与大量连接、I/O处理问题的有效方式。
	5.传统的服务器端同步阻塞I/O处理（也就是BIO，Blocking I/O）
	6.VO（View Object）：视图对象，用于展示层，它的作用是把某个指定页面（或组件）的所有数据封装起来。 
	7.@RequestBody
      i) 该注解用于读取Request请求的body部分数据，使用系统默认配置的HttpMessageConverter进行解析，
      然后把相应的数据绑定到要返回的对象上；
      ii) 再把HttpMessageConverter返回的对象数据绑定到 controller中方法的参数上。
	8.@ResponseBody
      该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，
      写入到Response对象的body数据区。
	9.请求路径上有个id的变量值，可以通过@PathVariable来获取  
	@RequestMapping(value = "/page/{id}", method = RequestMethod.GET)  
	10.hibernate中@Entity和@Table的区别：
@Entity说明这个class是实体类，并且使用默认的orm规则，即class名即数据库表中表名，class字段名即表中的字段名
如果想改变这种默认的orm规则，就要使用@Table来改变class名与数据库中表名的映射规则，
@Column来改变class中字段名与db中表的字段名的映射规则
必须使用 @javax.persistence.Id 来注解一个主键；
	11.委派模式（Delegate）是面向对象设计模式中常用的一种模式。这种模式的原理为类B和类A是两个互相没有任何关系的类，
	B具有和A一模一样的方法和属性；并且调用B中的方法，属性就是调用A中同名的方法和属性。
	B好像就是一个受A授权委托的中介。第三方的代码不需要知道A的存在，也不需要和A发生直接的联系，
	通过B就可以直接使用A的功能，这样既能够使用到A的各种公能，又能够很好的将A保护起来了。
	12. Ctrl + Shift + -（减号）同时显示两个相同的窗口

7.19
	0.bound mismatch 绑定不匹配
	1. persistence持久层是负责向（或者从）一个或者多个数据存储器中存储（或者获取）数据的一组类和组件。
	这个层必须包括一个业务领域实体的模型（即使只是一个元数据模型）
	2.对象关系映射（英语：(Object Relational Mapping，简称ORM，或O/RM，或O/R mapping），
	是一种程序技术，用于实现面向对象编程语言里不同类型系统的数据之间的转换[1]  。
	从效果上说，它其实是创建了一个可在编程语言里使用的--“虚拟对象数据库”、
	3.NoClassDefFoundError（编译时候找得到类）发生在JVM在动态运行时，根据你提供的类名，在classpath中找到对应的类进行加载，
	但当它找不到这个类时，就发生了java.lang.NoClassDefFoundError的错误，
	而ClassNotFoundException是在编译的时候在classpath中找不到对应的类而发生的错误。
	ClassNotFoundException比NoClassDefFoundError容易解决，是因为在编译时我们就知道错误发生，
	并且完全是由于环境的问题导致。而如果你在J2EE的环境下工作，并且得到NoClassDefFoundError的异常，
	而且对应的错误的类是确实存在的，这说明这个类对于类加载器来说，可能是不可见的。
	


	4.怎么看异常错误了：第一句一般是总的，告诉你哪里错了，错误就在caused by后面的语句提示里面，
	或者是自己写的类里面。异常信息是从上往下抛的，因为下面是调用上面的方法。
	
	
	5. CLASSPATH环境变量。作用是指定类搜索路径，要使用已经编写好的类，前提当然是能够找到它们了，
	JVM就是通过CLASSPTH来寻找类的。我们需要把jdk安装目录下的lib子目录中的dt.jar和tools.jar设置到CLASSPATH中，
	当然，当前目录“.”也必须加入到该变量中。
	6.事实上JDK 5.0默认就会到当前工作目录(上面的.设置)，以及JDK的lib目录
	(这里假设是C:\Program Files\Java\jdk1.5.0_06\lib)中寻找Java程序。所以如果Java程序是在这两个目录中，
	则不必设置Classpath变量也可以找得到
	7.eclipse开启和去掉代码上面的快速导航栏(Toggle Breadcrumb)的方法
点击工具栏上有个小三角（指向右的小三角）的Toggle Breadcrumb 图标就可以开启和关闭了。
	8.控制层（Web 层）
	spring 2.5 中除了提供 @Component 注释外，还有
	@Service用于标注业务层组件

@Controller用于标注控制层组件（如struts中的action）

@Repository用于标注数据访问组件，即DAO组件

@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
	
	7.20
	0.
	1.http://localhost:8080/fe/Text/index.html#/
	2.the request sent by the client was syntactically incorrect ().从字面上理解是：
	客户端发送的请求语法错误。实际就是springmvc无法实现数据绑定。 (此次是由于查询数据库查错了表导致的问题)
	3.GAV坐标，groupdid,artifactid,versions
	4.eclipse 查找类快捷键Ctrl+Shift+T
	5.Containing text：需要搜索的内容；
	File name patterns：文件的类型；
	scope：搜索范围   文件类型默认为*（指全部类型文件）
	4.file search在指定的文件中搜索，而不仅仅局限于java文件
	java search只是在当前workspace下的.java文件中搜索关键字。: case sensitive 勾选上,则区分大小写
	5.If you want to create a content-based Web application that does not contain any dynamic content 
	(such as servlets, JSP files, filters, and associated metadata) you might prefer to create a static Web project,
	as opposed to a dynamic Web project.
	6.eclipse快捷键
	ctrl+shift+r：打开资源、
	ctrl+o：快速outline
	 ctrl+e：快速转换编辑器
	 ctrl + L 快速跳到某一行
	 alt+shift+r：重命名
	 Alt+方向键  当前行的内容往上或下移动
	 Ctrl+m是编辑器窗口最大化的快捷键。
	 ctrl+.将光标移动至当前文件中的下一个报错处或警告处（不能用）。
	 这组快捷键我一般与ctrl+1一并使用，即修改建议的快捷键
	  Ctrl+T
	  查看一个类的继承关系树，是自顶向下的，再多按一次Ctrl+T, 会换成自底向上的显示结构。
	7.ESAPI.properties文件包含了所有的ESAPI中可以进行设置的部分


7.21
	0.clause 分句，从句
	1.回调函数，就是由你自己写的。你需要调用另外一个函数，而这个函数的其中一个参数，就是你的这个回调函数名
	2.相信大家在做itoo的时候都用过ajax异步提交数据，好处自然不言而喻，数据提交页面不会闪屏;页面局部更新速度快;
	网络带宽占用低。而表单提交则整个页面重绘。如果表单提交后跳转到另一个页面获取数据这种情况，
	采用传统的form表单提交和利用ajax进行表单提交都是可以实现的。
	3.由于受prototype.js（老外写的框架，用于将一些常用的函数封装，方便操作）的影响，
	现在很多人都用 $来表示一个查找对象的函数，
$=function (id) { return (typeof (id)=='object')?id:document.getElementByIdx_x(id); };
 其实就是一个自定义函数，用$只是简单，其实用其它字符也是一样的，
 则obj=$('ss')就是引用的这个id='ss'的对象
 （要在工程中include jQuery的库）
	4.JavaScript
	双引号中再用双引号要这样：
var str = "abc\"def\"ghi"
用反斜杠来禁止解析双引号。
单引号和双引号其实没啥区别
	5.alt+左箭头 查看上一个文件
alt+右箭头 下一个
	6.String 继承于CharSequence，也就是说String也是CharSequence类型。
	7.1.  a.html#
以#号结尾的一般情况是点击了空连接
<a href="#">空连接</a>
2.a.html#top
#号后带有其他字符的
一般是用作锚点，比如说常用的返回头部，
#号后面的top就是 顶部元素的id
比如<div id="top"></div>
<a href="#top">跳到 top</a>


************学习笔记************
****** @date  2017年7月22号  @location 帝都用友软件园   @author 杨路生******

7.22
	0.allocate 分配，分派
	1.web.xml里面配置springmmvc.xml时候，<param-value>里面如果以classpath开头的话
	classpath:开头的意思是说从 classpath中寻找目标文件。
web application的classpath包含 WEB-INF/lib下的所有jar包和WEB-INF/classes目录
	2. modelAndView.addObject( " 需要放到 model 中的属性名称 " , " 对应的属性值，它是一个对象 " );

7.23
	0.
	1.init-param面对应的参数名和值，是给servlet在初始化执行init()方法的时候(servlet有doGet doPost 
	在这之前还有init()方法 )。  可以在init()方法里调用这个参数的值，如：System.out.println
	(this.getInitParameter("param1"));  就会输出这个servlet里 打印init-name 名为"param1"的值。
	2.url-parrern里面放的是servlet访问路径,这个标签是在servlet-mapping里，这个里面还有个servlet-name,
	根据这个标签的名字服务器会找到被映射的同名servlet的字节码文件
	3.调试时，只要鼠标指针放在编辑框中的参数名称上，就会像多行注释一样，悬浮显示出来

	在eclipse程序中设置的断点上有一个斜杠无法进行debug调试
	在菜单里面，把skip all breakpoints 选项勾去即可,这个选项可能是你无意间选上的 
	4.
	log4j.properties
	Log4j是Apache的一个开放源代码项目，通过使用Log4j，我们可以控制日志信息输送的目的地是控制台、文件、GUI组件、
	甚至是套接口服务器、NT的事件记录器、UNIXSyslog守护进程等；我们也可以控制每一条日志的输出格式；
	通过定义每一条日志信息的级别，我们能够更加细致地控制日志的生成过程。最令人感兴趣的就是，
	这些可以通过一个配置文件来灵活地进行配置，而不需要修改应用的代码。
	5.POJO（Plain Ordinary Java Object）简单的Java对象，实际就是普通JavaBeans，是为了避免和EJB混淆所创造的简称。
	
7.24
	0.well-formed 形成   legacy 遗产，遗赠
	1.使用maven创建web工程，将spring配置文件applicationContext.xml放在src/resource下
	2.get cannot be resolved or is not a field 
获取无法解析或不是字段
	3.只有实现了Iteralbe接口的对象才能用高级for循环
	实现了Iteralbe接口的对象”指的是容器对象（比如LinkedList、HashSet），
	而不是容器中装的对象（比如String、int、float）
	4. 数据库中的date对应java.sql.Date;  把 java.uitl.Date存储到数据库，需要把 java.uitl.Date转化为java.sql.Date。
       Date utilDate  =new Date();
       java.sql.Date sqlDate = newjava.sql.Date(utilDate.getTime());然后就可以用sqlDate存入数据库了。
	5.SQL Parameter object cannot be null, which can be replaced by NullType Object!!
	SQL参数对象不能为空，可取代NullType Objec
	原因是由于新增加的id字段，以前的数据id为null导致的

7.25
	0.transactin 业务，交易  collate核对，校对   hit count 点击次数  dashboard 仪表盘
	drag-and-drop  	（鼠标的） 拖放动作;  agile 灵活的，灵巧的   toggle 切换，转换

	1.表现层(jsp)、持久层(类似dao)、业务层（逻辑层、service层）、模型（javabean）、控制层（action）
	2.RequestMapping  中RequestMethod cannot be resolved to a variable
	原因是要用ctrl + 1导入对应得RequestMethod的对应GET,POST	常量
	3.适配器模式的魅力：不改变原有接口，却还能使用新接口的功能。
	适配器模式将一个类的接口转换成客户期望的另一个接口，让原本不兼容的接口可以合作无间。
	4.一般的我们打开网页时出现502 bad gateway
说明服务器没有响应，也就是我们的web服务器没有接到有效的信息导致的。
	5.HttpServletRequest 类有 setAttribute() 方法，而没有setParameter() 方法。
	request.getParameter() 取得是通过容器的实现来取得通过类似post，get等方式传入的数据，
	request.setAttribute()和getAttribute()只是在web容器内部流转，仅仅是请求处理阶段。
	request.getParameter() 方法传递的数据，会从Web客户端传到Web服务器端，代表HTTP请求数据。
	request.getParameter()方法返回String类型的数据。
	6.1.设置cookie到客户端
Cookie c1 = new Cookie("username","hzh");
response.addCookie(c1);
cookie由服务器端创建，然后添加到HttpServletResponse中发送给客户端（浏览器）。
添加cookie时要指定cookie所在域（setPath），指定存在时长（setMaxAge）
从客户端读取Cookie时，包括maxAge在内的其他属性都是不可读的，也不会被提交。浏览器提交Cookie时只会提交name与value属性。
maxAge属性只被浏览器用来判断Cookie是否过期  
	7.默认情况下，出于安全方面的考虑，只有与创建 cookie 的页面处于同一个目录或在创建cookie页面的子目录下的网页
	才可以访问。那么此时如果希望其父级或者整个网页都能够使用cookie，就需要进行路径的设置。
	让这个设置的cookie 能被其他目录或者父级的目录访问的方法：
	document.cookie = "userName = "我我我"; path=/";
	8.PBC就是个人事业承诺。是指在全集团范围内通过自上而下地将集团、部门的工作目标逐级分解到每一位员工的方式，
	由直线经理与员工签订PBC，以实现组织绩效和个人绩效的有机联结。
	9.条件断点  并且如果布尔条件为真，就会执行该断点，否则将会跳过往下执行
	10.Swing 是一个为Java设计的GUI工具包。
Swing是JAVA基础类的一部分。
	11.就是这件事情是由你亲自操作办理的，称为经办人。
	12.SSH 标准的MVC架构思想，H 代表hibernate ，S，代表structs ，S，代表，spring

7.27
	1.
	2.invoke，提出，借助


7.28
	1.
	2.SQLParameter--[iuap01, 4206cd33-4087-4192-9081-f8bc9c6a6e68, 744838, 2017-07-10, 2017-07-11]
select * from ti_ticket where 1=1 and ( app = ?   or submitter_id = ?   or (code in('GD20170519173202')) ) 
and status_id = ? and create_time >= ? and create_time <= ?
	3.按照mysql的手册上面讲,DATETIME字符串传入DATE字段以后,会自动删除表示TIME的那一节

************学习笔记************
****** @date  2017年7月29号  @location 帝都用友软件园   @author 杨路生******

7.29
	0.
	1.date 字符串传入数据库datetime字段会自动增加具体时间00:00:00;
	2.MYSQL数据库中字符串和日期类型均用 单引号；
	3.MYSQL里面where表达式里面表示某个值为null，不能用= 得用 is null，is not null
	用in运算符里面用null 也没用
	4.MYSQL命令行左侧命令提示符前出现一个单引号是由于你缺半个单引号，只要你在输入半个单引号就行了。
	因为mysql中单引号是成对使用的，半个就不行，然后输入；
	回车就执行完了
	5.MYSQL里面between ...and 等价于 >= <=
	6.任何东西与NULL相加结果还是NULL
	7.ALTER TABLE tabname DROP PRIMARY KEY; MYSQL 里面去除primary key
	8.MYSQL 的auto_increment 默认从1 开始的
	9.ALL和ANY操作符的常见用法是结合一个相对比较操作符对一个数据列子查询的结果进行测试。
	它们测试比较值是否与子查询所返回的全部或一部分值匹配。比如说，如果比较值小于或等于子查询所返回的每一个值，
	<= ALL将是true；只要比较值小于或等于子查询所返回的任何一个值，<= ANY将是true。SOME是ANY的一个同义词。
	10.google chrome 快捷键
Ctrl+N	打开新窗口。
Ctrl+T	打开新标签页
F11 全屏
	11.适配器模式的三个特点：

11.1    适配器对象实现(implements)原有接口
11.2    适配器对象组合(如用内部依赖)一个实现新接口的对象（这个对象也可以不实现一个接口，只是一个单纯的对象）
11.3    对适配器原有接口方法的调用被委托给新接口的实例的特定方法
	12.xsi全名：xml schema instance
	13.Spring中有两种类型的Bean，一种是普通Bean，另一种是工厂Bean，即FactoryBean，这两种Bean都被容器管理，
	但工厂Bean跟普通Bean不同，其返回的对象不是指定类的一个实例，其返回的是该FactoryBean的getObject方法所返回的对象。
	14.关于在spring  容器初始化 bean 和销毁前所做的操作定义方式有三种：
第一种：通过@PostConstruct 和 @PreDestroy 方法 实现初始化和销毁bean之前进行的操作
第二种是：通过 在xml中定义init-method 和  destory-method方法
第三种是： 通过bean实现InitializingBean和 DisposableBean接口
	
7.31
	0.
	1.JSON 语法是 JavaScript 对象表示语法的子集。
数据在键值对中
数据由逗号分隔
花括号保存对象
方括号保存数组
	2.使用JSON.parse()。现在绝大多数浏览器都支持JSON.parse()，是推荐使用的方式。
	如果输入了不符合规范的字符串，会报错。JSON.parse()可以有第二参数，是一个函数。
	此函数有两个参数：name和value，分别代表名称和值。当传入一个JSON字符串后，
	JSON的每一组名称/值对都要调用此函数。该函数有返回值，返回值将赋值给当前的名称（name）。
	利用第二个参数，可以在解析JSON字符串的同时对数据进行一些处理。
	如JSON.parse(str,fun);

		var str = '{ "name":"123","age" :"12"}';
		fun为函数名


小心：键值对里面的name只能用双引号，不能用单引号和不用引号

	3.eval是Javascript内置函数，用于计算字符串表达式的值。例如eval("2+3") 返回的是5。
	动态地执行字符串里面的代码如
	eval("alert('333')");
	4.在火狐、谷歌和IE8以上浏览器中，空白也算是一个文本节点，但是在IE8和IE8以下浏览器中会忽略空白文本节点，
	5.childNodes：获取节点，不同浏览器表现不同；

　　IE：只获取元素节点；

　　非IE：获取元素节点与文本节点；

　　解决方案：if(childNode.nodeName=="#text") continue 或者 if(childNode.nodeType != '3') continue 

	6.判断对象是否为数组/对象的元素/属性：
格式：（变量 in 对象）......注意，，，
　　当“对象”为数组时，“变量”指的是数组的“索引”；

　　当“对象”为对象是，“变量”指的是对象的“属性”。
	7.Java命名规范

	类的命名 （单词首字母大写）
	常量的命名 （全部大写 ，常加下划线）
	8.Frequently Asked Questions  （FAQ）常见问题解答
	9.UUID含义是通用唯一识别码 (Universally Unique Identifier)，这 是一个软件建构的标准
	10.overdue 过期的; 延误的
	11.JIRA是Atlassian公司出品的项目与事务跟踪工具，被广泛应用于缺陷跟踪、
	客户服务、需求收集、流程审批、任务跟踪、项目跟踪和敏捷管理等工作领域。
	12.DRY（Don't repeat yourself ），字面意思来看："不要重复自己"。强调的意思就是在进行编程时相同的代码不要重复写，
	最好只写一次，然后可以在其他地方直接引用。如此一来，可以提高代码重用率，缩减代码量，
	同时也有助于提高代码的可读性和可维护性。当需要做出更改时，只需要更改一个地方即可。
	12.
	悲观锁(Pessimistic Lock), 顾名思义，就是很悲观，每次去拿数据的时候都认为别人会修改，
	所以每次在拿数据的时候都会上锁，这样别人想拿这个数据就会block直到它拿到锁。
	传统的关系型数据库里边就用到了很多这种锁机制，比如行锁，表锁等，读锁，写锁等，都是在做操作之前先上锁。

乐观锁(Optimistic Lock), 顾名思义，就是很乐观，每次去拿数据的时候都认为别人不会修改，所以不会上锁，
但是在更新的时候会判断一下在此期间别人有没有去更新这个数据，可以使用版本号等机制。乐观锁适用于多读的应用类型，
这样可以提高吞吐量，像数据库如果提供类似于write_condition机制的其实都是提供的乐观锁。

两种锁各有优缺点，不可认为一种好于另一种，像乐观锁适用于写比较少的情况下，即冲突真的很少发生的时候，
这样可以省去了锁的开销，加大了系统的整个吞吐量。但如果经常产生冲突，上层应用会不断的进行retry这样反倒是降低了性能，
所以这种情况下用悲观锁就比较合适。
	13.SLA：Service-Level Agreement的缩写，意思是服务等级协议。

AGUST
8.1
	0.decryption 解密   tenant 租户
	1.rg.apache.commons.lang.StringUtils中方法的操作对象是java.lang.String类型的对象，
	是JDK提供的String类型操作方法的补充，并且是null安全的
	(即如果输入参数String为null则不会抛出NullPointerException，而是做了相应处理，
	例如，如果输入为null则返回也是null等，具体可以查看源代码)。
除了构造器，StringUtils中一共有130多个方法，并且都是static的， 
所以我们可以这样调用StringUtils.xxx()。 
	2.若代理类在程序运行前就已经存在，那么这种代理方式被成为 静态代理 ，
	这种情况下的代理类通常都是我们在Java代码中定义的。 通常情况下， 
	静态代理中的代理类和委托类会实现同一接口或是派生自相同的父类。
	3.代理类在程序运行时创建的代理方式被成为 动态代理。 也就是说，这种情况下，代理类并不是在Java代码中定义的，
	而是在运行时根据我们在Java代码中的“指示”动态生成的。相比于静态代理，
	动态代理的优势在于可以很方便的对代理类的函数进行统一的处理，而不用修改每个代理类的函数。
	4.CDN
全称：Content Delivery Network或者Content Distribute Network，即内容分发网络或者内容交付网络。
控制时延无疑是现代信息科技的重要指标，CDN的意图就是尽可能的减少资源在转发、传输、链路抖动等情况下顺利保障信息的连贯性。
CDN就是扮演者护航者和加速者的角色，更快准狠的触发信息和触达每一个用户，带来更为极致的使用体验
	5.全栈工程师是指掌握多种技能，并能利用多种技能独立完成产品的人。
	[1]  也叫全端工程师(同时具备前端和后台能力)，英文Full Stack developer。
	6.重构就是通过调整程序代码改善软件的质量、性能，使其程序的设计模式和架构更趋合理，提高软件的扩展性和维护性。
	7.Apache Shiro是Java的一个安全框架。
	8.-Xms256m -Xmx1024m，表示最小内存256M，最大1G
	9.如果无限小数的小数点后，从某一位起向右进行到某一位止的一节数字循环出现，首尾衔接，
	称这种小数为循环小数，这一节数字称为循环节．

8.2	0.
	1.没在form表单的input不会被提交到服务器，同时服务端request.getParameter(“变量名”)不会得到变量值

8.3	0.deprecated 反对  pickpocket 扒手   trigger 引发，触发
	1.CAS是Central Authentication Service的缩写，中央认证服务，一种独立开始指令协议。
	CAS 是 Yale 大学发起的一个开源项目，旨在为 Web 应用系统提供一种可靠的单点登录方法
	2.只要不是80端口的，就一定要在网址后边输入端口号，另外，还要注意一点，如果不是以域名形式输入非80端口的网址，
	而是以IP形式输入的话，IP前边一定要加上http:// ，就如：http://192.168.0.1:8080 才正确，
	不能输入：192.168.0.1:8080
	3.chrome浏览器中Provisional headers are shown提示，一般来说，如果看到这个提示，说明这个请求并没有发送出去。
	具体原因有多种，除了上面提到的情况外，还可能是请求被某些扩展如 Adblock 给拦截了，请求被墙了，
	走本地缓存或者 dataurl 的请求，也会这样显示。

	用 chrome://net-internals 来帮助你查找被屏蔽的请求以及可能的原因。
	4. Ctrl + J chrome查看下载内容快捷键
	Ctrl + H 查看历史记录
	5.var url = "organizePeople.php?timeStamp=" + new Date().getTime();解决浏览器缓存问题
	6.premium 保险费，额外费用；附加费

8.4
	0.mock interview 模拟面试  billing 演员表，营业额，账单  vendor 卖主，小贩，供应商
	SDK、外语全称：Software Development Kit
	1.ZooKeeper—— “动物园管理员”  
	ZooKeeper是一个为分布式应用程序提供高性能协调服务的工具集合。
	2.PING不能透过NAT，因为PING不能指定端口，NAT也就无从转发
	3.http的默认端口是80，也就是说，如果我们将Tomcat端口号修改为80，
	输入网址的时候就可以不用输入端口了，直接输入网址即可
	4.<script src="//design.yyuap.com/static/yonyouyun/es6-promise.auto.min.js"></script>
	其中//之前省略了http:

	5.所以这两个目录(Java Resources，Deployed Resources)层级只是IDE为我们添加的，便于编程而添加的。
	Java Resource 目录是Source Folder，
	该目录下的资源都会被打包到：WEB-INF/classes 文件夹下。注意：
	你会发现在Java Resource下的文件夹下创建的jsp,html等网页文件都会被自动放置到src/main/webapp文件夹下，
	因为在这里默认的content directory目录是src/main/webapp，IDE会将网页的文件放置到这个content directory目录下。
	在dynamic web project 中content directory的默认目录是：WebContent
war包中的文件结构都来源于Deployed Resources。而Java Resource以及Deployed Resources中的文件都是来源于：
src目录
所以这些文件夹实际上是同一个文夹件，因此当我们CRU等操作是相互级连的。
需要注意的是：META-INF以及WEB-INF是java web的规范，是默认生成的，
并且放置在里边的jsp，html等等网页是不能够通过浏览器直接访问的。
	6.比如有个需求， 需要保存客户信息， 有些客户从网站来， 有些从手机客户端来，
	有些从后台管理系统录入， 假设不同来源的客户有不同的处理业务流程， 这个时候我定义接口来提供一个保存客户的方法，
	然后不同平台实现我这个保存客户的接口， 以后保存客户的话， 我只用知道这个接口就可以了，
	具体调用哪个方法  去实例化具体你需要用的类，这也就是JAVA的多态的体现。
	7.查看某个具体的端口号有没有被占用，输入如下命令：netstat -aon|findstr "端口号"。
	例如查看80端口的使用情况：netstat -aon|findstr "80"
	8.在SpringMvc控制器中的方法的参数,写@RequestParam注解与不写的区别?
1,如果表单中的name字段与方法中的参数名一致的话,会自动设置
2,写的话,可以给表单name提交的参数改个名字,如:@RequestParam("user")User u,user是表单提交的,可以换成u

8.5
	0.rendering 翻译，表演，透视图
	1.Provisional headers are shown
	之所以会出现这个警告，是因为去获取该资源的请求其实并（还）没有真的发生，所以 Header 里显示的是伪信息，
	直到服务器真的有响应返回，这里的 Header 信息才会被更新为真实的。不过这一切也可能不会发生，
	因为该请求可能会被屏蔽。比如说 AdBlock 什么的，当然了不全是浏览器扩展，具体情况具体分析了。

8.7
	0.
	1.Build Path是指定Java工程所包含的资源属性集合。
在一个成熟的Java工程中，不仅仅有自己编写的源代码，还需要引用系统运行库（JRE）、
第三方的功能扩展库、工作空间中的其他工程，甚至外部的类文件，所有这些资源都是被这个工程所依赖的，
并且只有被引用后，才能够将该工程编译成功，而Build Path就是用来配置和管理对这些资源的引用的。
Build Path一般包括：
JRE运行库
第三方的功能扩展库（*.jar格式文件）
其他的工程
其他的源代码或Class文件
	2.html中，路径前加“/” 与不加“/”有区别，请问是为什么？ 
	加“/”是代表绝对路径，不加“/”是代表相对路径。
	3.小心数据库里面表示时分秒是用datetime二不是date

8.8	0.enctype  编码方式  invoke 调用   archetype 原型 典型
	1.SSO英文全称Single Sign On，单点登录。SSO是在多个应用系统中，
	用户只需要登录一次就可以访问所有相互信任的应用系统。
	它包括可以将这次主要的登录映射到其他应用中用于同一个用户的登录的机制。
	它是目前比较流行的企业业务整合的解决方案之一。
	2.Shindig是一个参考容器，可以运行在任何网站上，用来支持OpenSocial的社交应用。
	3.把iframe解释成“浏览器中的浏览器“很是恰当
	4.多租户技术（英语：multi-tenancy technology）或称多重租赁技术，是一种软件架构技术，
	它是在探讨与实现如何于多用户的环境下共用相同的系统或程序组件，并且仍可确保各用户间数据的隔离性。
	5.用友iuap是用友公司结合云计算、移动、大数据、社交等技术研制的，完全基于互联网架构的企业互联网开放平台。
	Uap(统一应用平台)
	6.Portlet是基于Java的Web组件，由Portlet容器管理，并由容器处理请求，生产动态内容。
	Portals使用Portlets作为可插拔用户接口组件，提供信息系统的表示层。
	7.alarm也称为闹钟函数，它可以在进程中设置一个定时器
	8.crud是指在做计算处理时的增加(Create)、读取查询(Retrieve)、更新(Update)和删除(Delete)几个单词的首字母简写。
	9.session的活化与钝化就是当用户访问时网站异常，不能丢掉session，所有也必须采用文件存储；
	和之前那个统计网站访问量一样的原理。
 class Person implements HttpSessionActivationListener,Serializable
必须实现这两个接口，实现session活化和钝化的要求
活化：从硬盘上读取到内存中
钝化：从内存中写到硬盘上
	10.对应服务器的响应头的
Content-Security-Policy: upgrade-insecure-requests
	该指令用于让浏览器自动升级请求从http到https,用于大量包含http资源的http网页直接升级到https而不会报错.
	简洁的来讲,就相当于在http和https之间起的一个过渡作用.

	而在浏览器的请求头出现的
Upgrade-Insecure-Requests:1
则是告诉服务器，自己支持这种操作，也就是我能读懂你服务器发过来的上面这条信息，
并且在以后发请求的时候不用http而用https
	11.链接地址最后面加 / 有什么用吗？
	对于搜索引擎来说，加斜杠和不加斜杠没有任何区别，但是为了你的网站URL地址更加标准，
	还是建议大家最好统一加上。事实上这是有区别的，当服务器收到一个没有加斜杠的网址请求的时候，
	它需要花费时间去确定这个地址的文件类型。
	12.html是骨架,css是装饰，javascript动态效果
	html好比就是一个人，css是给人穿上了衣服，搞了发型等等，javascript就是让其他人认为这个人是有生命的，而不是死的。
	13.页面渲染都是浏览器的工作。
大致分为以下几步：
加载：根据请求的URL进行域名解析，向服务器发起请求，接收文件（HTML、JS、CSS、图象等）。
解析：对加载到的资源（HTML、JS、CSS等）进行语法解析，建议相应的内部数据结构（比如HTML的DOM树，JS的（对象）属性表，
CSS的样式规则等等）
渲染：构建渲染树，对各个元素进行位置计算、样式计算等等，然后根据渲染树对页面进行渲染（可以理解为“画”元素）
这几个过程不是完全孤立的，会有交叉，比如HTML加载后就会进行解析，然后拉取HTML中指定的CSS、JS等。
	14.jar文件包括Java普通类、资源文件和普通文件，在maven中即是打包src/main/java和src/main/resources
	资源文件夹下的所有文件。在打包的时候会自动生成MATA-INF文件夹，用于存储maven的pom信息和MANIFEST.MF文件
	15.DHTML是Dynamic HTML的简称，就是动态的html（标准通用标记语言下的一个应用），
	是相对传统的静态的html而言的一种制作网页的概念。所谓动态HTML（Dynamic HTML，简称DHTML），
	其实并不是一门新的语言，它只是HTML、CSS和客户端脚本的一种集成，即一个页面中包括html+css+javascript
	（或其它客户端脚本），其中css和客户端脚本是直接在页面上写而不是链接上相关文件。DHTML不是一种技术、标准或规范
	，只是一种将目前已有的网页技术、语言标准整合运用，制作出能在下载后仍然能实时变换页面元素效果的网页设计概念。

8.9	0.` backquote 反引号  " doublequote  !exclam  & ampersand  / slash  \ backslash 反斜杠  ^ caret
* asterisk,star(美语),数学公式中作multiply    reveal 揭露，显露   Bio 个人简历(biography的缩写)
violet n.紫罗兰; 蓝紫色   tab 选项卡  ship 传输  troubleshoot 故障排除
	1.ANSI在不同地区对应不同的编码
	2.固定布局：顾名思义，网页上的所有元素的尺寸一律使用px作为单位。
	这种布局方式对设计师和CSS编写者来说都是最简单的，亦没有兼容性问题，例如，
	直接设定网页的主体部分宽度为960px，某个搜索框宽度为60px等等。缺点显而易见，
	即不能根据用户的屏幕尺寸做出不同的表现。当前，大部分门户网站、大部分企业的PC宣传站点都采用了这种布局方式。

	流式布局：
网页中主要的划分区域的尺寸使用百分数（搭配min-*、max-*属性使用），例如，
设置网页主体的宽度为80%，min-width为960px。图片也作类似处理（width:100%, max-width一般设定为图片本身的尺寸，
防止被拉伸而失真）。这种布局方式在Web前端开发的早期历史上，用来应对不同尺寸的PC屏幕（那是屏幕尺寸的差异不会太大），
在当今的移动端开发也是常用布局方式，但缺点明显：宽度使用百分比定义，但是高度和文字大小等大都是用px来固定，
所以在大屏幕的手机下显示效果会变成有些页面元素宽度被拉的很长，但是高度、文字大小还是和原来一样
（即，这些东西无法变得“流式”），显示非常不协调。
	
	弹性布局
	3.什么是互联网＋？现在很多人的共识是，所谓的互联网＋就是互联网平台上加上一个传统行业，
	相当于给传统行业加一双“互联网”的翅膀，然后助飞传统行业。比如互联网金融，由于与互联网的相结合，
	诞生出了很多普通用户触手可及的理财投资产品，比如余额宝、理财通以及p2p投融资产品等；比如互联网医疗，
	传统的医疗机构由于互联网平台的接入，使得人们实现在线求医问药成为可能，这些都是最典型的互联网＋的案例。
	4.软编码和硬编码
	5.数据源（Data Source）顾名思义，数据的来源，是提供某种所需要数据的器件或原始媒体。
	在数据源中存储了所有建立数据库连接的信息。就像通过指定文件名称可以在文件系统中找到文件一样，
	通过提供正确的数据源名称，你可以找到相应的数据库连接

8.10
	0.
	1.移动互联网，就是将移动通信和互联网二者结合起来，成为一体。是指互联网的技术、平台、商业模式
	和应用与移动通信技术结合并实践的活动的总称
	2.PUBLIC的DTD都有一个逻辑名称——DTD-name，我们必须在调用时指明这个逻辑名称。
	3.Java 8允许我们给接口添加一个非抽象的方法实现，只需要使用 default关键字即可，这个特征又叫做扩展方法

	Java 8 允许你使用 :: 关键字来传递方法或者构造函数引用
	静态方法
	Converter<String, Integer> converter = Integer::valueOf;
	对象方法
	 converter = something::startsWith;
	 4.抽象类中不一定包含抽象方法，但是包含抽象方法的类一定要被声明为抽象类
	5.native关键字说明其修饰的方法是一个原生态方法，方法对应的实现不是在当前文件，
	而是在用其他语言（如C和C++）实现的文件中。Java语言本身不能对操作系统底层进行访问和操作，
	但是可以通过JNI接口调用其他语言来实现对底层的访问。
	6.所谓SQL注入，就是通过把SQL命令插入到Web表单提交或输入域名或页面请求的查询字符串，
	最终达到欺骗服务器执行恶意的SQL命令。具体来说，它是利用现有应用程序，
	将（恶意的）SQL命令注入到后台数据库引擎执行的能力，它可以通过在Web表单中输入（恶意）
	SQL语句得到一个存在安全漏洞的网站上的数据库，而不是按照设计者意图去执行SQL语句。

	举个例子你就懂了例如你要查询id=1的记录,直接连接就是这样"select * from tableName where id=1"
	别人可以写成"select * from tableName where id=1;delete from tableName" 

	7.UUID含义是通用唯一识别码 (Universally Unique Identifier)，这 是一个软件建构的标准

	8.At least one JAR was scanned for TLDs yet contained no TLDs. 
	Enable debug logging for this logger for a complete list of JARs 
	that were scanned but no TLDs were found in them.
	Skipping unneeded JARs during scanning can improve startup time and JSP compilation time
	原因是在 JSP页面引入了没有用的标签
	解决办法，删除没有用到的标签就可以

	9.TLD
	Top Level Domain 顶级域名 它是一个因特网域名的最后部分，
	也就是任何域名的最后一个点后面的字母组成的部分。
　　最早的顶级域名.com（公司和企业）;.net（网络服务机构）;.org（非赢利性组织）;.edu（教育机构）;.
gov（美国专用的政府部门）;.int（国际组织）
	
	10.？？？？TLD术语解释：标签库描述文件，如要在JSP页面中实现JSP标签，必须首先定义实现标签的类，
	然后在标签库描述文件（TLD）中将写好的类映射成jsp标签,最后在JSP文件中使用定义好的标签，
	就可以生成动态的JSP内容

	11.CRM概念（Customer Relationship Management 客户关系管理）
	12.List<String> list = new ArrayList();
//Java7以后可以省略后面尖括号的类型参数

8.11
	0.eviction   逐出，赶出  backlog 挤压未办之货，存货  apprentice 学徒；新手
	1.所谓门户网站，是指通向某类综合性互联网信息资源并提供有关信息服务的应用系统
	2.ASP.NET是由微软在·NET Framework框架中所提供，开发Web应用程序的类库，封装在System.Web.dll文件中
	.aspx文件是微软的在服务器端运行的动态网页文件，通过IIS解析执行后可以得到动态页面
	3.通过document.write()方法,向网页文档中输出了一段文字。
document.write("我爱学习--喜欢学习，就和大家一起来分享你的学习经验与技巧。。。");
	4.“BranchCache"称为分支缓存
	5.PID全称是Process Identification
	6.Tomcat work目录主要存放了jsp编译后的.class文件以及它的源码


************学习笔记************
****** @date  2017年8月12号  @location 帝都用友软件园   @author 杨路生******


8.12
	0. implied 说明，表明；暗指的  blend 混合
	1.系统吞吐量几个重要参数：QPS（TPS）、并发数、响应时间

        QPS（TPS）：每秒钟request/事务 数量

        并发数： 系统同时处理的request/事务数

        响应时间：  一般取平均响应时间

（很多人经常会把并发数和TPS理解混淆）

理解了上面三个要素的意义之后，就能推算出它们之间的关系：

QPS（TPS）= 并发数/平均响应时间
	2.压测调优：压力测试和调优
	3.不知道按到什么或者点到什么按钮了，在eclipse里面鼠标就变成了十字架形式。解决办法是按：alt+shift+a
原来alt+shift+a是框选代码的。
	4.Tomcat 热部署（atuodeploy）：服务器运行过程中，将应用程序部署进去
	5.http://localhost:8080 就是服务器的根路径，path = "/a"中的/代表服务器的根路径
	6.注意,tomcat 服务器server.xml里面注释也不能写中文，否则会无法启动服务器
	7.tomcat默认访问的应用是ROOT
	8.ipv4 4段 ipv6 6段

8.13
	0.
	1.  在cmd中用telnet连接tomcat，出现了“正在连接localhost...无法打开到主机的连接。
	网上建议：在端口 8080: 连接失败”原因是我的tomcat是绿色版的，没有安装。
解决办法是：在Eclipse中将tomcat启动。
	2.无状态协议是指比如客户获得一张网页之后关闭浏览器，然后再一次启动浏览器，再登陆该网站，
	但是服务器并不知道客户关闭了一次浏览器。
	http是无状态协议，协议的状态是指下一次传输可以“记住”这次传输信息的能力.
	而DNS是有状态协议
	3.text/css 表示大类型文本类型下的css类型
	4.1、也就是说通常情况下一个域名同一时刻只能对应一个IP地址。
但是在域名服务商那里，你可以把服务器群里面的多个提供相同服务的服务器IP设置一个域名可以轮询。但是同一时刻，
一个域名只能解析出一个IP供你使用。这些IP可以轮流着被解析。
这些IP其实对应的服务器提供的是同一种的服务。
2、一个IP可以绑定无数个域名，这个没有限制。


8.14
	0.
	1.浏览器加载资源成功一般会有几种状态

200 ok  　　　　　　　　----  从原始服务器请求成功

200 ok from cache   　  ----

200 ok from disk cache  ----

200 ok from memory cache ----

304 not modified          ----  向服务器发送请求，验证新鲜度，足够新鲜，服务器会返回 304状态


from cache 表示客户端没有请求服务器， 直接使用浏览器本地缓存

1. 首先from cache  和 not modified的区别

from cache 浏览器没有和服务器确认，直接使用了缓存

not modified 是浏览器和服务器多确认了一次缓存有效性，再用的缓存。

 
那么，两者触发的时机有什么区别呢？200 OK (from cache) 是直接点击链接访问，输入网址按回车访问也能触发
而 304 Not Modified 是刷新页面时触发，或是设置了长缓存、但 Entity Tags 没有移除时触发。

直接访问有缓存的网站都触发 200 OK (from cache)， 刷新浏览器则会触发 304 Not Modified，同一域名下，
没有 Entity Tag 的资源直接访问，是 200 OK (from cache) 的结果，同一域名下，有 Entity Tag ，
直接访问就会触发 304 Not Modified。

2. from memory cache 和 from disk cache 的区别

MemoryCache顾名思义，就是将资源缓存到内存中，等待下次访问时不需要重新下载资源，而直接从内存中获取。
Webkit早已支持memoryCache。

    目前Webkit资源分成两类，一类是主资源，比如HTML页面，或者下载项，一类是派生资源，
    比如HTML页面中内嵌的图片或者脚本链接，分别对应代码中两个类：　　　　MainResourceLoader和SubresourceLoader。
    虽然Webkit支持memoryCache，但是也只是针对派生资源，它对应的类为CachedResource，用于保存原始数据（比如CSS，JS等），
    以及解码过的图片数据。

diskCache顾名思义，就是将资源缓存到磁盘中，等待下次访问时不需要重新下载资源，而直接从磁盘中获取，
它的直接操作对象为CurlCacheManager。它与memoryCache最大的区别在于，当退出进程时，内存中的数据会被清空，
而磁盘的数据不会，所以，当下次再进入该进程时，该进程仍可以从diskCache中获得数据，而memoryCache则不行。

    diskCache与memoryCache相似之处就是也只能存储一些派生类资源文件。它的存储形式为一个index.dat文件
记录存储数据的url，然后再分别存储该url的response信息和content内容。
Response信息最大作用就是用于判断服务器上该url的content内容是否被修改。

	2.google  chrome  里面的 Type 显示document
	是加载的文档，比如html文件的类型就是属于文档document还有css之类的或者文本文件都是的
	3.Java 程序包括源代码（.java文件）、由编译器生成的类（.class文件）、
	由归档工具jar生成的.jar文件、对象状态序列化.ser文件 
	4.什么是JavaBean（VO：Value Object；DO：Data Object；POJO：最简单的java对象,DTO Data Transfer Object）
	5.(1)-Xms，jvm启动时，初始分配的堆/栈内存
(2)-Xmx，JVM最大允许分配的堆/栈内存，按需分配
(3)-Xss，设定每个线程的堆栈大小
(4)-XX:PermSize，JVM初始分配的非堆内存
(5)-XX:MaxPermSize，JVM最大允许分配的非堆内存，按需分配
举例：
-Xms256m -Xms512m -XX:PermSize=64m -XX:MaxPermSize=128m

%_EXECJAVA% %JAVA_OPTS% %CATALINA_OPTS% %DEBUG_OPTS% -Djava.endorsed.dirs="%JAVA_ENDORSED_DIRS%"
-classpath "%CLASSPATH%" -Dcatalina.base="%CATALINA_BASE%" -Dcatalina.home="%CATALINA_HOME%" 
-Djava.io.tmpdir="%CATALINA_TMPDIR%" %MAINCLASS% %CMD_LINE_ARGS% %ACTION%
在 %DEBUG_OPTS% 后面添加-Xms256m -Xmx512m（大约添加四次）
在bin下catalina.bat
	6.^ 和 $ 他们是分别用来匹配字符串的开始和结束，以下分别举例说明：
      "^The": 开头一定要有"The"字符串;
      "of despair$": 结尾一定要有"of despair" 的字符串;
      你可以看见如果你没有用我们提到的两个字符(最后一个例子)，就是说 模式(正则表达式) 
      可以出现在被检验字符串的任何地方，你没有把他锁定到两边。
       "ab{2,}": 要求a后面一定要有两个或者两个以上b(如"abb", "abbbb", 等.);
        "a(bc)*": 匹配 a 后面跟0个或者一个"bc"
	  "(b│cd)ef": 匹配含有 "bef" 或者 "cdef"的字符串;

	7.Dangling Pointers---(悬挂指针)野指针如果指针在被释放后,仍然引用原来的内存,就叫做野指针
	8.var pattern=/正则表达式/;
var pattern=new RegExp("");（JS里面的）
/表示定界符

	JAVA则不用加//

	9.JAVA正则表达式,matcher.find()和 matcher.matches()的区别
1.find()方法是部分匹配，是查找输入串中与模式匹配的子串，如果该匹配的串有组还可以使用group()函数。

matches()是全部匹配，是将整个输入串与模式匹配，如果要验证一个输入的数据是否为数字类型或其他类型，一般要用matches()
Pattern pattern= Pattern.compile(".*?,(.*)");

    Matcher matcher = pattern.matcher(result);

  if (matcher.find()) {
   return matcher.group(1);
  }
	10.
public boolean find()尝试查找与该模式匹配的输入序列的下一个子序列。  
此方法从匹配器区域的开头开始，如果该方法的前一次调用成功了并且从那时开始匹配器没有被重置，
则从以前匹配操作没有匹配的第一个字符开始。  
如果匹配成功，则可以通过 start、end 和 group 方法获取更多信息。  

(因为可能正则表达式里面分组了，按照不同的组匹配了，对于matches)
group是针对（）来说的，group（0）就是指的整个串，group（1） 指的是第一个括号里的东西，
group（2）指的第二个括号里的东西。

	11.注意正则表达式里面的+，？ ，*等不能单独使用
	12.@Test里面的expected是 没出现对应异常才报错，出现了就正常，只不过异常后面的代码没运行了

	13.注意，修改了Servlet的名称后，要手动去web.xml里面修改servlet和servlet-mapping标签，eclipse不会帮你改

	注意开发路径和浏览器访问服务器路径区别，用好getRealPath（）；
	14.String类里面的replace不支持正则表达式替换，而replaceAll支持
	String replaceAll(String regex, String replacement)  

8.15
	0.convention 会议，惯例，习俗  subsequent 随后的，后来的   stacktrace  堆栈轨迹
	deprecation 强烈不赞同，反对
	recursive  递归的，回归的
	1.JNI是Java Native Interface的缩写，它提供了若干的API实现了Java和其他语言的通信（主要是C&C++）
	2.WEB-INF是Java的WEB应用的安全目录，客户端无法访问，只有服务端可以访问的目录。
	3.填写路径时候，别忘了WEB-INF下的classes
	4.首先我们要明白用response.sendRedirect做转向的原理，它其实是向浏览器发送一个特殊的Header，
	然后由浏览器来做转向，所以无法访问WEB-INF目录，因为2

	在使用response.sendRedirect时，前面不能有HTML输出。 
	在response.sendRedirect之后，应该紧跟一句return; 
	5.Java世界中主要有三大构建工具：Ant、Maven和Gradle。经过几年的发展，Ant几乎销声匿迹、
	Maven也日薄西山，而Gradle的发展则如日中天。
	6.Gradle抛弃了Maven的基于XML的繁琐配置，众所周知XML的阅读体验比较差，
	对于机器来说虽然容易识别，但毕竟是由人去维护的。取而代之的是Gradle采用了领域特定语言Groovy的配置，
	大大简化了构建代码的行数
	7.Gradle将Spring源码转换为
	eclipse项目时候用 gradle cleanIdea eclipse 出现错误
	Starting a Gradle Daemon (subsequent builds will be faster)

FAILURE: Build failed with an exception.

* What went wrong:
Unable to start the daemon process.（守护线程）
This problem might be caused by incorrect configuration of the daemon.
For example, an unrecognized jvm option is used.
Please refer to the user guide chapter on the daemon at https://docs.gradle.org/4.0.1/userguide/gradle_daemon.html
Please read the following process output to find out more:
-----------------------
Error occurred during initialization of VM
Could not reserve enough space for object heap（堆内存不够）
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.

解决方法
radle.properties文件下加上org.gradle.jvmargs=-Xmx512m
又出现错误

FAILURE: Build failed with an exception.

* What went wrong:
java.lang.UnsupportedClassVersionError: org/sonarqube/gradle/SonarQubePlugin : 
Unsupported major.minor version 52.0
> org/sonarqube/gradle/SonarQubePlugin : Unsupported major.minor version 52.0

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED in 2s

JDK版本不一样
因为源码用的是JDK1.8（在Redame.md中可以看到）

	8.Unified Modeling Language (UML)又称统一建模语言或标准建模语言
	9.MyEclipse中创建web项目后，web程序的根目录文件夹是WebRoot，而创建dynam web project时候，web程序的根
目录文件夹是WebContent,他们之间没有本质区别，都表示你的web程序的根目录文件夹。
	10.创建web项目时候注意勾选创建web.xml的选项
	11.执行顺序:
执行父类静态代码 执行子类静态代码
初始化父类成员变量（我们常说的赋值语句）
初始化父类构造函数
初始化子类成员变量
初始化子类构造函数
	12.float f=3.4;是否正确？
答:不正确。3.4是双精度数，将双精度型（double）赋值给浮点型（float）属于下转型（down-casting，也称为窄化）
会造成精度损失，因此需要强制类型转换float f =(float)3.4; 或者写成float f =3.4F;。
	13.String 是最基本的数据类型吗？
答：不是。Java中的基本数据类型只有8个：byte、short、int、long、float、double、char、boolean；
除了基本类型（primitive type）和枚举类型（enumeration type），剩下的都是引用类型（reference type）。
	14.解释内存中的栈(stack)、堆(heap)和静态区(static area)的用法。
答：通常我们定义一个基本数据类型的变量，一个对象的引用，还有就是函数调用的现场保存都使用内存中的栈空间；
而通过new关键字和构造器创建的对象放在堆空间；程序中的字面量（literal）如直接书写的100、”hello”和常量都是放在静态区中。
栈空间操作起来最快但是栈很小，通常大量的对象都是放在堆空间，理论上整个内存没有被其他进程使用的空间甚至硬盘上的
虚拟内存都可以被当成堆空间来使用。

String str = new String("hello");
上面的语句中变量str放在栈上，用new创建出来的字符串对象放在堆上，而”hello”这个字面量放在静态区。

补充：较新版本的Java（从Java 6的某个更新开始）中使用了一项叫”逃逸分析”的技术，
可以将一些局部对象放在栈上以提升对象的操作性能。	
	15.Math.round(11.5)的返回值是12，Math.round(-11.5)的返回值是-11。四舍五入的原理是在参数上加0.5然后进行下取整。
	16.switch 是否能作用在byte 上，是否能作用在long 上，是否能作用在String上？
答：在Java 5以前，switch(expr)中，expr只能是byte、short、char、int。从Java 5开始，Java中引入了枚举类型
，expr也可以是enum类型，从Java 7开始，expr还可以是字符串（String），但是长整型（long）在目前所有的版本中都是不可以的。
	17.数组没有length()方法，有length 的属性。String 有length()方法。JavaScript中，
	获得字符串的长度是通过length属性得到的，这一点容易和Java混淆。
	18.构造器（constructor）是否可被重写（override）？
答：构造器不能被继承，因此不能被重写，但可以被重载。
	19.String 类是final类，不可以被继承。
	20.当一个对象被当作参数传递到一个方法后，此方法可改变这个对象的属性，并可返回变化后的结果，
	那么这里到底是值传递还是引用传递？
答：是值传递。Java语言的方法调用只支持参数的值传递。当一个对象实例作为一个参数被传递到方法中时，
参数的值就是对该对象的引用。对象的属性可以在被调用过程中被改变
	21.重载（Overload）和重写（Override）的区别。重载的方法能否根据返回类型进行区分？
答：方法的重载和重写都是实现多态的方式，区别在于前者实现的是编译时的多态性，而后者实现的是运行时的多态性。
重载发生在一个类中，同名的方法如果有不同的参数列表（参数类型不同、参数个数不同或者二者都不同）则视为重载；
重写发生在子类与父类之间，重写要求子类被重写方法与父类被重写方法有相同的返回类型，比父类被重写方法更好访问，
不能比父类被重写方法声明更多的异常（里氏代换原则）。重载对返回类型没有特殊的要求。

面试题：华为的面试题中曾经问过这样一个问题 – “为什么不能根据返回类型来区分重载”
	22.bootstrap 引导程序  strap 皮带，拼命工作
	23.Static Nested Class(静态嵌套类)是被声明为静态（static）的内部类，它可以不依赖于外部类实例被实例化。
	而通常的内部类需要在外部类实例化后才能实例化，其语法看起来挺诡异的
	24.抽象的（abstract）方法是否可同时是静态的（static）,是否可同时是本地方法（native），
	是否可同时被synchronized修饰？
答：都不能。抽象方法需要子类重写，而静态的方法是无法被重写的，因此二者是矛盾的。
本地方法是由本地代码（如C代码）实现的方法，而抽象方法是没有实现的，也是矛盾的。
synchronized和方法的实现细节有关，抽象方法不涉及实现细节，因此也是相互矛盾的。
	25.字节数组流：
ByteArrayOutputStream:    可以捕获内存缓冲区的数据，转换成字节数组。
ByteArrayoutputStream bout=new ByteArrayOutputStream();
bout.write(int a);  bout.write(int b);  bout.write(int c);
byte[] buf=bout.toByteArray();//获取内存缓冲中的数据
	26.String s = new String(“xyz”);创建了几个字符串对象？
答：两个对象，一个是静态区的”xyz”，一个是用new创建在堆上的对象。
万一常量池中已经有了“xyz”这个字符串，那么只会在堆中创建一个对象
	27.构造器就是构造函数，但是在Java里并没有构造方法这一名词
这一名词是在C++以往的外文书籍中直译过来的
	28.TomCat 服务器下的WEB-INF文件夹是一个非常安全的文件，在页面中不能直接访问其中的文件，
	必须通过web.xml文件对要访问的文件进行相应映射才能访问
	使用" ../ ../ "之类的间接访问也不能成功。

	 <%String path = request.getContextPath(); %>
	 ${pageContext.request.contextPath}来可以访问
	29.由于String类是final修饰的，不可变
	java中是没有指针的，java中只存在值传递，只存在值传递！！！  然而我们经常看到对于对象（数组，类，接口）
	的传递似乎有点像引用传递，可以改变对象中某个属性的值。但是不要被这个假象所蒙蔽，
	实际上这个传入函数的值是对象引用的拷贝，即传递的是引用的地址值，所以还是按值传递。
	30.特殊考虑String，以及Integer、Double等几个基本类型包装类，它们都是immutable类型，
因为没有提供自身修改的函数，每次操作都是新生成一个对象，所以要特殊对待，可以认为是和基本数据类型相似，传值操作
	31.Win + Ctrl + 左/右切换Windows桌面
	创建新桌面：Win + Ctrl + D 
	关闭当前虚拟桌面：Win + Ctrl + F4
	32.String(byte[] bytes, Charset charset) 
	怎样将GB2312编码的字符串转换为ISO-8859-1编码的字符串？
答：代码如下所示：
String s1 = "你好";
String s2 = new String(s1.getBytes("GB2312"), "ISO-8859-1");
	33.assert默认是不启用的，启用就需要在编译、运行时加上相关的关键字


8.16
	0.idle 空闲的，懒惰的
	1.回调地址即在这里用来指定跳转回网站的URL。 回调地址注册的目的是为了保障第三方APPID帐户的安全,
	以免被其他恶意网站盗用 。
	2.最本质的区别是RuntimeException是运行时才会发生的异常, 而受检查异常是编译时异常,
	编译器会分析哪些异常会在执行一个方法或者构造函数的时候抛出。 
	3.工单点击某些按钮显示404找不到，是由于HTML里面的script里面的src地址问题，加上/fe,并且清空Tomcat缓存和日志，
	使用无痕浏览
	4.set classpath=%classpath%;路径；注意=前后不要有空格，路径是jar包路径，用于命令行编译java文件
	5.Servlet里面创建Servlet是通过servlet-class 通过反射机制创建（用无参构造器）
	单实例，多线程
	6.配置servlet时候，在url-pattern 里面路径名必须加/(当后面有一个或多个/时候，或/*) ,没有/ 启动时候都会报错
	
	有*.do ,*.abc等不允许*.*
	structs里面一般是*.do
	7.tomcat 也有web.xml ,里面也有 servlet-mapping,里面的url-pattern有一个/，（/匹配匹配不到的，自己配的/优先，
	）解决找不到报404错误


8.17
	0.
	1.工单项目，出现“创建工单如查询用户失败，空指针异常，等”，友互通（yht）查询数据报异常，是可能由于证书路径不对的原因，
	在sdk.properties里面修改两个路径
	#\u5ba2\u6237\u7aef\u8eab\u4efd\u6587\u4ef6\u8def\u5f84
#改的
client.credential.path=F:/yonyou/authfile.properties
#改的
yht.client.credential.path=F:/yonyou/yhtauthfile.properties

#client.credential.path=/usr/local/tomcat/ticket/WEB-INF/class/authfile.properties2017/7/19
2.
Java 怎么调用另外一个项目的接口？

你把他们的包放在你们的项目里，然后通过引入对方的接口，定义一个接口对象，调用相应的方法就可以了啊。
1.将一个项目打成jar包，第二个项目进行导入该jar包，就可以使用第一个项目里的类方法属性等
2.将第一个项目发布出去，然后第二个项目调用，所谓发布出去就是开发远程接口，允许其他人调用，比如创建webservice，将第一个项目接口发布出去，这样第二个项目可以远程调用，当然你能问目前这个问题，webservice肯定不会用，不过没关系，以后就懂了
3. 
chrome 浏览器调试栏status为canceled
你在这两个请求都没返回的时候就用window.location.href = "kaowo://location-end"让页面跳转到另外一个页面，所以前一个页面的请求就算返回也没有用，所以会被取消
可以在请求返回之后再跳转，或者直接取消这两个请求
4.    .bak文件是一个备份文件，全称是：backup
5. MyThread2 t1 = new MyThread2("TestJoin");
      t1.start();
      t1.join();  //join()合并线程，子线程t1运行完之后，主线程才开始执行

join()方法还有带超时限制的重载版本。 例如t.join(5000);则让线程等待5000毫秒，如果超过这个时间，则停止等待，变为可运行状态
join是Thread 的非静态方法

Thread.Join把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行的线程。比如在线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
6. POC，是Proof of Concept的缩写，意思是为观点提供证据
7. Logback是由log4j创始人设计的又一个开源日志组件。
8. 捕获组概念：捕获组也就是Pattern中以括号对“()”分割出的子Pattern。至于为什么要用捕获组呢，主要是为了能找出在一次匹配中你更关心的部分。
9. 凭证或者凭据是指登录时当前用户的登陆名和密码等信息
10.被集成系统指的是第三方系统
11. Data Set NAME,数据集名
12.servlet-mapping里面url-pattern里面/*与/区别是，/*是匹配的上的,/是都匹配不上时的

url-pattern 里面如ABC.abc也可以

注意：
请求url 是/abc/abc.do 也匹配*.do

8.18
0.principal 主要的，负责人  the third-party system  第三方系统
1.web.xml里面的servlet标签里面的子标签 load-on-startup的文本从2开始，因为，Tomcatconf下的web.xml的default Servlet以已经有了1
2. select a.* from a 和select * from a有什么区别吗数据库会把*号翻译成a表的所有字段。
没什么差别，select a.* from a 只是为了在多表查询时，区别开来
比如：select a.AA, b.AA from a, b
a, b 中都有 AA 字段， select *，* from 就会 起冲突，数据库不知道要取那个字段的值
3. 聚合，指分散的聚集到一起。
4. 如果窗口本身是顶层窗口，parent属性返回的是对自身的引用
如window.parentNode 就是window
5. src 属性规定在 iframe 中显示的文档的 URL。
6. 升级win10系统之后，需要重新安装Oracle,因为在安装Oralce11g时，使用64位的会出现各种不兼容问题，我每次安装都是使用32位的数据库。
在安装时点击setup.exe之后，出现了:[INS-13001]环境不满足最低要求
这时，打开你的解压后的database文件夹，找到stage，然后cvu,找到cvu_prereq.xml文件，用记事本打开，增添一下内容
<OPERATING_SYSTEM RELEASE="6.2">
           <VERSION VALUE="3"/>
           <ARCHITECTURE VALUE="32-bit"/>
           <NAME VALUE="Windows 10"/>
           <ENV_VAR_LIST>
               <ENV_VAR NAME="PATH" MAX_LENGTH="1023" />
           </ENV_VAR_LIST>
</OPERATING_SYSTEM>
这一段和上面的最主要的不同就是6.2和window10
如何你安装的是64位的，则将32-bit改成64bit就可以了！改动后保存。从新点击setup.exe就不会出项这个错误提示了！
7.空格显示为 %20（底层用了URLEncoder进行了编码）
8.path = “c:/a/b/c.jpg”
用path.lastIndexOf(“/”)找不到/，得用path.lastIndexOf(“\\”)才找得到；因为java虚拟机认为的是\\(它会转换)
9.中文文件名，如图片等，需用URLEncoder转换(文件与内容不一致)；但是文件名和内容一样，如文本，则用setContentType
10.Servlet和ServletConfig是“关联”关系，指的是从Servlet可以得到ServletConfig（通过
getServletConfig（））

ServletConfig和ServletContext也是关联关系，通过ServletConfig的getServletContext()
 
小心HttpServletRequest和HttpServletResponse都是接口，对应得实现了是HttpServletRequestWrapper和HttpServletResponseWrapper



8.19
0.lite 清淡的   substrate 底层，基层  transaction 事务
1. 开始--运行--services.msc-----
找到服务：OracleOraDb11g_home1TNSListener 与 OracleServiceORCL（注意其中的ORCL服务名）。
这两个就是oracle启动必须的两个服务（默认为自动启动），启动这两个服务就等于开启oracle了。
2. 从10G开始,Oracle提供了一个较为轻量级的客户包，叫做Instant Client. 将它安装好后，就不用再安装庞大的Oracle Client了
3. sqlplus hr/toor登陆到Oracle数据库
4.  
密码也是admin
申请证书hardkey.req
再去
http://udn.yyuap.com/license.php申请证书，发到邮箱后将对应文件license.resp（）再到licenseserver导入授权

 
选uapv6

登陆新华书店项目，注意端口号是8085，访问wbalone ，用户名admin,密码admin123
5.Oracle里面的“口令”指的就是密码
6. PL/SQL Developer是一个集成开发环境，专门开发面向Oracle数据库的应用。PL/SQL也是一种程序语言，叫做过程化SQL语言（Procedural Language/SQL）。PL/SQL是Oracle数据库对SQL语句的扩展
PL/SQL 只有 Oracle 数据库有。 MySQL 目前不支持 PL/SQL 的。

7ORACLE用SYS登录报ORA-28009：connection as SYS should be as SYSDBA OR SYSOPER解决方法

要在输入口令：口令+as sysdba(比如：toor as sysdba) 注意空格
8. 
创建用户wo,密码toor
create user wo identified by toor default tablespace users Temporary TABLESPACE Temp;
用户授权grant connect,resource,dba to wo;
grant sysdba to wo;
9. E:\app\LuS\product\11.2.0\dbhome_1\NETWORK\ADMIN
下tnsnames.ora
10.Oracle 显示某用户所有表(例如SCOTT,必须大写)
select TABLE_NAME from all_tables where owner = 'SCOTT';

select TABLE_NAME from all_tables where owner = 'WO';
当写成小写的wo则查不到
小心，查询表时要在对应用户下操作才行
其次，Oracle提示符变为2，是由于漏写分号导致的
10. 数据库管理员（Database Administrator，简称DBA）
11. 在Oracle服务器的命令行里sqlplus / as sysdba命令可以登陆到sqlplus命令行里。
然后比如是C:/a.sql，那么就执行@C:/a.sql，然后跑完后这个a.sql就被导入进来了。
12. tns就是通过tcp/ip协议远程连接到其他机器上的Oracle，basic就是指本机中的Oracle
Tns: Transparent Network Substrate

13. ERROR:
ORA-01756: 引号内的字符串没有正确结束 
SELECT DISTINCT A.JNO FROM Rt AS A WHERE NOT EXISTS (SELECT PNO FROM St AS B WHERE NOT EXISTS (SELECT JNO,PNO FROM Rt AS C WHERE C.JNO=A.JNO AND B.PNO=C.PNO)) GROUP BY A.JNO
*
第 1 行出现错误: 

ORA-00933: SQL 命令未正确结束
如果确认没有语法错误，那么就是sql文件编码的问题，由于oracle是用Java写的，所以我们在写sql脚本时应该保存为ANSI编码
（另存为，选择编码为ANSI即可，一般用另存为就可以看到该文件所用的编码格式了）
14.
mysql -uroot -ptoor;错误
ERROR 1045 (28000): Access denied for user 'root'@'localhost' (using password: YES)
不要加最后的分号
15.
java没有异常 也会执行finally的 ,.
先try
若有异常则catch..再finally
无异常try结束则finally
（1）try语句没有被执行到，如在try语句之前就返回了，这样finally语句就不会执行，这也说明了finally语句被执行的必要而非充分条件是：相应的try语句一定被执行到。
（2）在try块中有System.exit(0);这样的语句，System.exit(0);是终止Java虚拟机JVM的，连JVM都停止了，所有都结束了，当然finally语句也不会被执行到。
finally语句是在try的return语句执行之后，return返回之前执行

8.20
0.
1.MySQL开启两个窗口是两个线程
MySQL中用set transaction isolation level read uncommitted 设置临时的事务隔离级别
设置完后用select @@tx_isolation查，还是没变，不用管，实际上已经变了，由于是临时的
2.小心多态，编译看左边，运行看右边
多态分为两种情况：编译时多态和运行时多态。如果在编译时能够确定执行多态方法
中的哪一个，称为编译时多态，否则称为运行时多态。
      方法重载都是编译时多态。根据实际参数的数据类型、个数和次序，Java在编译时能够确定执行重载方法中的哪一个。 
方法覆盖表现出两种多态性，当对象引用本类实例时，为编译时多态，否则为运行时多态。
静态方法无法“运行时多态”
3.小心同样的名称如Connection 不同包，java.sql.Connection里面是接口，而在MySQL的包里面是实现类（实现了那个接口，implements时候加上包名）

4.要包装的类就是“被包装类”

8.21
0.
1. Person p=new Person("zhangsan",20);
   该句话所做的事情：

   1.在栈内存中，开辟main函数的空间，建立main函数的变量 p。
   2.加载类文件：因为new要用到Person.class,所以要先从硬盘中找到Person.class类文件，并加载到内存中。
    加载类文件时，除了非静态成员变量（对象的特有属性）不会被加载，其它的都会被加载。
    记住：加载，是将类文件中的一行行内容存放到了内存当中，并不会执行任何语句。---->加载时期，即使有输出语句也不会执行。
     静态成员变量（类变量）  ----->方法区的静态部分
     静态方法                ----->方法区的静态部分
     非静态方法（包括构造函数） ----->方法区的非静态部分
     静态代码块     ----->方法区的静态部分
     构造代码块     ----->方法区的静态部分
     
     注意：在Person.class文件加载时，静态方法和非静态方法都会加载到方法区中，只不过要调用到非静态方法时需要先实例化一个对象，对象才能调用非静态方法。如果让类中所有的非静态方法都随着对象的实例化而建立一次，那么会大量消耗内存资源，
     所以才会让所有对象共享这些非静态方法，然后用this关键字指向调用非静态方法的对象。   
   3.执行类中的静态代码块：如果有的话，对Person.class类进行初始化。
   4.开辟空间：在堆内存中开辟空间，分配内存地址。
   5.默认初始化：在堆内存中建立 对象的特有属性，并进行默认初始化。
   6.显示初始化：对属性进行显示初始化。
   7.构造代码块：执行类中的构造代码块，对对象进行构造代码块初始化。
   8.构造函数初始化：对对象进行对应的构造函数初始化。
   9.将内存地址赋值给栈内存中的变量p。
静态代码块：用于给类初始化，类加载时就会被加载执行，只加载一次。
  构造代码块：用于给对象初始化的。只要建立对象该部分就会被执行，且优先于构造函数。
  构造函数：  给对应对象初始化的，建立对象时，选择相应的构造函数初始化对象。  
   创建对象时，三者被加载执行顺序：静态代码块--->构造代码块--->构造函数
  

  Test t = null;// JVM加载Test类，静态代码块执行？？？是吗？
不会，不会加载类，除非在该类方法里面写，方法执行时候自然会加载类（因为在该类里面）

什么时候会加载类？
  使用到类中的内容时加载：有三种情况
    1.创建对象：new StaticCode();
    2.使用类中的静态成员：StaticCode.num=9;  StaticCode.show();
    3.在命令行中运行：java StaticCodeDemo
2.
只需要将原接口转化为客户希望的另一个接口，就是适配器模式！
转化无非就是1.“”继承原类“”或者实现原接口  2.持有原接口的对象
再实现目标接口。。。。
那么第一种就是类的适配（指1），第二种就是对象的适配（指2）！

代理模式一定是自身持有这个对象，不需要从外部传入。而装饰模式的一定是从外部传入，并且可以没有顺序
再从使用上来看，代理模式注重的是隔离限制，让外部不能访问你实际的调用对象，比如权限控制，装饰模式注重的是功能的拓展，在同一个方法下实现更多的功能。

3. 代理类与委托类的关系：
        代理类与委托类具有相同的接口，但委托类是接口的真正实现者，代理类只是调用委托类的相关方法来提供特定的服务，代理类可以为委托类预处理信息、把信息传递给委托类处理并进行事后处理。
代理类分为静态代理类和动态代理类。
动态代理类是利用java的反射机制生成。
4.  Oracle Call Interface (OCI) 
5.GenericServlet用了适配器模式，
HttpServlet用了模板方法设计模式
6.Properties是HashTable的子类
prop.load(DBCPUtil.class.getClassLoader().getResourceAsStream(“dbcpconfig.properties”))
getResource()是返回class文件所在路径url
（小心，因为这里DBCPUtil import导入了包，所以不用加包名）

7. C3P0是一个开源的JDBC连接池，它实现了数据源和JNDI绑定，支持JDBC3规范和JDBC2的标准扩展。目前使用它的开源项目有Hibernate，Spring等。

很多人都用过java的数据库连接池C3P0，但官方没有说明名称的由来。
据传闻：连接池作者是《星球大战》迷，C3P0就是其中的一个机器人，并且这个名称中包涵connection 和pool的单词字母。因此叫这个名字。
 
C3P0就是下图中的右边的那个机器人。左边是他哥哥R2D2。
 
8.不是java web工程，即是java工程，jar包需要自己建一个lib目录，放在里面，注意lib必须手动右键build path
9.alt + shift + z处理异常
10. JNDI(Java Naming and Directory Interface,Java命名和目录接口)是SUN公司提供的一种标准的Java命名系统接口
11.虚拟机使用host-only，可以实现和主机通信，和虚拟机间通信，但要注意关闭虚拟机防火墙
12.访问虚拟机的Oracle数据库
sqlplus scott/tiger@192.168.1.101:1521/orcl
13. instantclient-basiclite-windows.x64-12.1.0.1.0.zip
instantclient-sqlplus-windows.x64-12.1.0.1.0.zip需要解压到同一个目录

8.22
0.
1.Basic lite 是Basic 版本的精简版
2. 在Oracle安装目录中listener.ora里面增加黄色部分
SID_LIST_LISTENER =
  (SID_LIST =
    (SID_DESC =
      (SID_NAME = CLRExtProc)
      (ORACLE_HOME = E:\app\LuS\product\11.2.0\dbhome_1)
      (PROGRAM = extproc)
      (ENVS = "EXTPROC_DLLS=ONLY:E:\app\LuS\product\11.2.0\dbhome_1\bin\oraclr11.dll")
    )

     (SID_DESC =  

       (SID_NAME = ORCL)
       (ORACLE_HOME = E:\app\LuS\product\11.2.0\dbhome_1)
	 (ENVS = "EXTPROC_DLLS=ONLY:E:\app\LuS\product\11.2.0\dbhome_1\bin\oraclr11.dll")
      )
  )
可能还要添加Path环境变量里面instanceclient（可能必须用basic而非basiclite）的安装路径
可能需要环境变量
 
3.
oracle事务处理 自动提交
提交数据有三种类型：
显式提交、隐式提交及自动提交。下面分别说明这三种类型。
1、显式提交：用COMMIT命令直接完成的提交为显式提交。其格式为：SQL>COMMIT；
2、隐式提交： 用SQL命令间接完成的提交为隐式提交。这些命令是：ALTER，AUDIT，COMMENT，CONNECT，CREATE，DISCONNECT，DROP，EXIT，GRANT，NOAUDIT，QUIT，REVOKE，RENAME。
3、自动提交：若把AUTOCOMMIT设置为ON，则在插入、修改、删除语句执行后，系统将自动进行提交，这就是自动提交。其格式为：SQL>SET AUTOCOMMIT ON；
4.  
NLS_LANG 环境变量
第一种解决办法，临时修改服务器的字符集环境变量，然后再执行sqlplus修改环境字符集命令如下：
export NLS_LANG=AMERICAN_AMERICA.ZHS16GBK
   第二种解决办法，确认数据库字符集为什么，一般为UTF-8，那么在保存update.sql文件的时候，选择UTF-8格式进行保存。  最好在update.sql内容头里面加上以下命令方便定位问题：
spool update.log
set feedback off
set define off

编码不对应会出现执行语句错误
ORA-01756: quoted string not properly terminated
且Oracle默认用的是ANSI 编码

5.Servlet 里面的init方法是由服务器调用的，如果子类复写了该方法，则服务器就会调用子类的，不会调用父类的了；如果复写了，补救办法是在里面用super调用父类的init
6. 
为什么jsp不需要在web.xml中配置servlet需要
 TOMCAT或者其他服务器里面有配置jsp的编译、解析了，而servlet没有默认配置
7.域对象（如ServletContext）在底层有一个Map，用来放置数据（键值对）
8.web.xml里面可以配置ServletContext的属性，用<context-param>
ServletContext 用getInitParameter（“name”）获取属性，
注意ServletConfig也有getInitParameter（“name”），注意区别
9灰常重要
 
注意如果要读取的文件在package下，则路径中加上package名 其中的.用/代替；
如果文件在WebRoot或者WebContent（即和WEB-INF同一个父目录，即项目根目录下），
则直接/文件名即可
注意”/”是工程根目录，相当于工程名下
 
其中pro.getProperty(“key”);获取值
 
注意别加上后缀名，默认会自动加上.properties
注意默认的路径从src开始，对应服务器上classes，所以只有p1，没有/等
 
ResourceBundle缺陷，不能拿取Web资源的内容（即WebRoot下的东西）

哥，注意多看JDK文档和JAVAEE文档
 
类加载器默认路径也是src
 
 
 
注意由于默认是src下,所以用../../
在WebContent下用../../文件名，得到null???
至于这种情况下直接用/p3.properteis（工程根路径下）行不行？？待测
 

10. request.getContextPath()
 
request.getContextPath()是在开发Web项目时，经常用到的方法，其作用是获取当前的系统路径。
    当使用Tomcat作为Web服务器，项目一般部署在Tomcat下的webapps的目录下。具体来说主要用两种部署的路径：
    一是将web项目中的webRoot下的文件直接拷贝到webapps/ROOT下（删除ROOT下的原有文件）；
    另一中方法在Tomcat下的webapps中创建以项目名称命名（当然也可以用其他的名称）的文件夹，并将webRoot下的文件直接拷贝到该文件夹下。
    对于第一部署方法，request.getContextPath()的返回值为空（即："",中间无空格，注意区分null)。
    对于第二部署方法，其返回值为：/创建的文件夹的名称。
11.

 

 

8.23
0.
1.
用字节流输出中文不会出现乱码，因为平台和浏览器都默认用GBK
2.URLEncoder
 
3.
请求重定向
 
4.
服务器将请求头里面的信息封装在HttpServletRequest里面,并且帮我们创建它的实例
5.
URI = 工程路径 + 资源地址
6.
doGet或者service等执行完了，HttpServletRequest就死亡了，因为是形参，延长生命可以用请求转发
7.
 
8.
客户端（指浏览器）访问服务的端口是随机的
 
9.
 
10.
获取同名控件的值
比如填写密码，确认密码
 
11.
 
12.
Javabean一般实现Serializable接口，因为用于硬盘存储或网络数据传输（必须实现该接口），
保证对象的完整性
 

 
、、
 
、、
 
注意，数组类型也可以向上转型到Object


8.24
0.comma 逗号
1.注意，Portal所需要的sola默认是在D盘下env里面
2.
注意Servlet里面是调用request.getSession()时候创建HttpSession对象，
而JSP里面默认有个开关，默认为开，一访问jsp就创建了session
 

3.eclipse 里面.xml 在根标签中用F2可以查看其子标签包含哪些和顺序
4.
Filter eclipse不会帮你在web.xml里面配置，需要自己手动配置
 

8.25
0.
1.
 
如何判断一个数组中是否包含一个字符或字符串
第一种方法：遍历数组
String[] arr1 = {"1","2","3","4","6","7"};
for (int i = 0; i < arr1.length; i++) {
if("5".equals(arr1[i])) {
System.out.println("包含");
}else {
System.out.println("不包含");
}

}
第二种方法：先把数组转换成list；再判断contains
String[] arr = {"1","2","3","4","6","7"};
List<String> list=Arrays.asList(arr);
System.out.println(list.contains("5"));

3. 当光标在一行的两端时，按住shift+home/end可以选择当前行
4.License启动报错，错误有同步time…错误，是由于一起同步或其它错误导致，删除缓存即可，到比如F:\LicenseServer\bin下删掉所有文件即可
5. eclipse中查看某个方法（函数）被谁调用
选中要查找的方法名，右键->References->Workspace 可以定位到具体的调用位置，快捷键Ctrl+Shift+G，在Search中就会出现调用方法
或者是 右键->References->Project/Hierarchy，Workspace搜索的范围>Project>Hierarchy。
6.
 
注意 用户名字段 必须勾选 “用户编码”选项



8.27
0.
1.注意request.getRarameter(“name”)；如何表单里面name没填，该函数返回的是空字符串而非null
如果name在表单属性里面不存在，则返回null
2.
Eclipse里面JSP自动导包用 alt + /，注意要在类名后面用，而不是类名中间
3.
 

 

4.解决请求数据传输过来乱码
 
注意如果是get 方式提交，会进行两次编码，先进行URIEncoder，变成如%20形式，再进行ISO-8859-1编码，所以需要首先ISO-8859-1反向，在utf-8反向

 

添加URIEncoding
 
5.超链接用get传数据，注意键后面不要有空格，不然键里面就包含空格了
 
超链接中文乱码解决和4一样
6.
 
7.下图红色部分是绝对路径“”
 

下面是相对路径
 
8.请求包含
 
包含后两者是同一个request
9.要想获得select标签里面option的值，必须写name
 

请求转发和请求包含方向不一样，一个是过去，一个是过来
10.
注意post传递的数据如果用get方式提交也可能乱码
11.
Javascript如何拿到表单，用javascript提交数据，好处可以校验数据是否合法
 

12.
 
注意，当提交方式不统一时候，上图以get 提交，以form.method为主
13.ServletContext的请求转发
 
ServletContext在其作用域内转发？？？？
14.
 

8.28
0.
1. 注意，别直接写类下
， 
2.java web也可以用@Test，别傻乎乎的放在类上，要放在方法上
3.
注意，这样会导致打印出nulldd
 
4.
注意<script>src引用了内容就不能在<script></script>中写内容，反之亦然
5.
 


 

 


6.
 

 

 

 


7. 一个html元素 能否有多个class

如: <input type="text" class="Class1 Class2"/>
多个class中间加空格就行
8.
注意./aa/c.txt 和 d.txt区别在于，当是当前目录下的文件时候直接写文件名，当是当前目录下的子目录下的文件要用./
9.
onclick 属性由元素上的鼠标点击触发。
注释：onclick 属性不适用以下元素：<base>、<bdo>、<br>、<head>、<html>、<iframe>、<meta>、<param>、<script>、<style> 或 <title>。


8.29
0.
nth 
adj.	第n个的;

1.在iuap应用平台（新华书店）数据库里面 status 0 代表未读，1代表已读
2.HTML5的新特性，input里面的placeholder属性，注意低版本IE不支持HTML5

8.30
0. colon 冒号
1. 
 
2.
 
3.
Css
 
4.
 
SEP
9.4
0.transient 短暂的，临时的  ^  caret

1.
n/a或N/A是英语“不适用”（Not applicable）等类似单词的缩写，常可在各种表格中看到。
N/A比较多用在填写表格的时候，表示“本栏目（对我）不适用”。在没有东西可填写，但空格也不允许此项留白的时候，可以写N/A。在英语国家，也会用n/a或者n.a.来表达，都是同一个意思。
2.
cookie是一个有时间限制的网页端存储数据的东西，token一般是个服务器算法加MD5加密生成的一个字符串，用来和客户端验证用户有效性，一般服务器再用户登陆时存储在cookie里，每次登陆都会重新生成token
3.
 

 


9.5
0.
1.JavaScript 当alert弹出对话框中文全是？？？？,原因可能是由于保存的js文件用了ANSI编码，改回utf-8保存或者其他对应编码
2.
 

3.
 

 

 

4.
 


5.
&”在HTML语言中是字符串连接符，用于连接两个字符串，或者变量。例如， var temp
"This is "&temp&"program"
HTML中 &amp 代表&
6.
 


9.6
0.endpoint 端点，终点
1.
模拟浏览器请求，如果出现500
可能是由于请求数据的问题
 

 

不要view parsed  要 view source的请求数据

2.

 

注意，java模拟浏览器请求时候，哥哥你不能少了date= ,否则依然会500

注意，content-type类型一定要填对

3.
 


绑定数据
 

this表示的是javascript提供的当前对象
$(this)表示的是用jquery封装候的当前对象
this对象可以直接用this.style修改样式
$(this)可以使用jquery提供的方法访问样式

4.
用在网页上，默认情况下它们起的均是加粗字体的作用，二者所不同的是，<b>标签是一个实体标签，它所包围的字符将被设为bold（粗体），而<strong>标签是一个逻辑标签，它的作用是加强字符的语气，一般来说，加强字符的语气是通过将字符变为bold（粗体）来实现的。
简单的说strong是web标准中xhtml的标签，strong的意思是“强调”；b是html的，b的意思是bold（粗体）。

5.
 

6.
 

 

 


7.
 

8.
如果data是字符串，使用eval("("+data+")")可以将其转换为json对象，和JSON.parse的功能一样。
如果data是json对象，使用eval("("+data+")")会报错，正如你描述的错误。eval一个json对象，没有什么作用，这个时候不需要使用eval方法，直接用data即可。
eval会带来很多问题，不建议使用，如果想实现转化用JSON.parse更好)
9.
 
10.
事件冒泡
 

解决办法
 

11.
阻止默认行为
 

9.7
0. suffix 后缀  pk:primary key 主键   Enable block comment formatting 
启用块注释格式化

1.模拟浏览器访问新华书店的消息，出现306，可能是由于cookie过时，要用新的才可以
2.
<section> 标签定义文档中的节（section、区段）。比如章节、页眉、页脚或文档中的其他部分。
<section> 标签是 HTML 5 中的新标签。
3.
在HTML中，URL地址有相对和绝对之分。绝对的URL如：
<a href="http://www.some.com/a.html">link</a>
相对的URL如：
<a href="a.html">link</a>
对于相对的URL，浏览器在处理的时候（发送HTTP请求），会将它转化为绝对地址：使用当前HTML文档URL的协议、域名和路径进行补充完整。
而对于题主所说的例子，则表示：
1. 如果当前页面使用的是HTTP协议，则其绝对地址为
http://www.ischufang.com/zb_users/theme/easylife/style/favicon.ico
2. 如果当前页面使用的是HTTPS协议，则其绝对地址为
https://www.ischufang.com/zb_users/theme/easylife/style/favicon.ico

4.
顶级域名就是一级域名，比如 .com .org .cn
N级域名就是在N-1级域名前追加一级。
比如二级域名是在一级域名前加一级，二级域名示例：http://baidu.com http://zhihu.com      http://qq.com
注： 有些人会说 http://baidu.com http://zhihu.com http://qq.com 是一级域名，虽然是错误的-但可以理解(说的人多了也就是对的了……)，这是站在使用者/购买者角度看的，对于购买域名者来说 http://xxx.com http://xxx.com.cn就相当一级域名，但是从真正的域名分级看，它们俩分别是二级域名、三级域名。

document.domain="qq.com"; 是什么意思？
同一基础域名之间的"跨域"。
简单的说，就是为了解决同在qq.com域名下的二级、三级域名的跨域问题。
举例，声明了qq.com后，在tech.qq.com下调用news.qq.com下的内容，就可通过js跨域操作，包括ajax等。

5.
http和https使用的是完全不同的连接方式,用的端口也不一样,前者是80,后者是443。http的连接很简单,是无状态的,... 
HTTPS协议是由SSL+HTTP协议构建的可进行加密传输、身份认证的网络协议


6.
浏览器访问网站的端口默认设置为80端口
FTP：21
SSH：22
MYSQL：3306
DNS：53
HTTP：80
POP3：109
Https：443


9.8
0.
1. 
工单项目：工单创建及分配的邮件提醒增加系统名称及登录地址


 

 


 


2.

SSL(Secure Sockets Layer 安全套接层),及其继任者传输层安全（Transport Layer Security，TLS）是为网络通信提供安全及数据完整性的一种安全协议。

3.
 

删除Cookie
 
小心，即使所谓的删除了，但是得重启浏览器，不然，由于浏览器缓存了，看起来仍然像是没删一样

4.
 

Cookie的getName()和判断是否是null

5.
Cookie 设置setPath(“/”)
 

6.
一 获取URL:
getRequestURL()
二 获取参数列表:
1.getQueryString()
只适用于GET,比如客户端发送http://localhost/testServlet?a=b&c=d&e=f,通过request.getQueryString()得到的是a=b&c=d&e=f.

2.getParameter()
GET和POST都可以使用
但如果是POST请求要根据<form>表单提交数据的编码方式来确定能否使用.
当编码方式是(application/x- www-form-urlencoded)时才能使用.
这种编码方式(application/x-www-form-urlencoded)虽然简单，但对于传输大块的二进制数据显得力不从心.
对于传输大块的二进制数这类数据，浏览器采用了另一种编码方式("multipart/form-data"),这时就需要使用下面的两种方法.
3.getInputStream()
4.getReader()
上面两种方法获取的是Http请求包的包体,因为GET方式请求一般不包含包体.所以上面两种方法一般用于POST请求获取参数.
需要注意的是：
request.getParameter()、 request.getInputStream()、request.getReader()这三种方法是有冲突的，因为流只能被读一次。
比如：
当form表单内容采用 enctype=application/x-www-form-urlencoded编码时，先通过调用request.getParameter()方法得到参数后,
再调用request.getInputStream()或request.getReader()已经得不到流中的内容，
因为在调用 request.getParameter()时系统可能对表单中提交的数据以流的形式读了一次,反之亦然。
当form表单内容采用 enctype=multipart/form-data编码时，即使先调用request.getParameter()也得不到数据，
所以这时调用request.getParameter()方法对 request.getInputStream()或request.getReader()没有冲突，
即使已经调用了 request.getParameter()方法也可以通过调用request.getInputStream()或request.getReader()得到表单中的数据,
而request.getInputStream()和request.getReader()在同一个响应中是不能混合使用的,如果混合使用就会抛异常。



7.
请求转发支持相对路径

 



9.10
0.
1.request.getSession()
 

2.
只要浏览器没全部关闭，浏览器缓存不会清空
如IE，打开不同的IE用的是统一个缓存
3.
Tomcat    conf\web.xml设置session的时间，以分钟为单位
 

4.
注意a里面href引号的写法 ‘ “” ’
 


9.11
0. gadget 小玩意，小配件
1.
插入SQL语句，里面如果单引号，则必须成对，用两个单引号才能代替一个单引号


9.12
0.collapse 折叠
1. 用户体验（User Experience，简称UX或 UE）
2.
ACID，指数据库事务正确执行的四个基本要素的缩写。包含：原子性（Atomicity）、一致性（Consistency）、隔离性（Isolation）、持久性（Durability）。一个支持事务（Transaction）的数据库，必需要具有这四种特性，否则在事务过程（Transaction processing）当中无法保证数据的正确性，交易过程极可能达不到交易方的要求。
3.
DBCP里面的Connection调用close并非真的关闭了连接，因为被复写了该方法

4.
企业门户消息中心 全部，已读里面传的状态参数不该是readed而该是read
修改F:\PortalEnvironment\apache-tomcat-7.0.79\webapps\integration\pages\message\message.html和task.js 
和

 

5.
http://localhost:8080/portal/index.html#/pwPolicy
注意#后面的（或者近意，同义）来查找对应的js，html等源码

6.chrome Elements 中出现$ ==0表示当前你选中的元素
7.

:before 和 :after 都差不多的，就是可以在某个标签的前面或者后面添加一个虚拟元素,需结合content使用

如
div:after {
visibility: hidden;
clear: both;
display: block;
height: 0px;
content: "."
}
下面是它不是在css里面的，而是在div里面
这个是写在css里的，自己可以下载源码 查找。或者你在网页空白处右键点击审核元素，然后点击before，右侧就出来before 的css了。


 


8.
#代表网页中的一个位置。其右面的字符，就是该位置的标识符。比如，http://www.example.com/index.html#print就代表网页index.html的print位置。浏览器读取这个URL后，会自动将print位置滚动至可视区域。
　　为网页位置指定标识符，有两个方法。一是使用锚点，比如<a name="print"></a>，二是使用id属性，比如<div id="print">。

HTTP请求不包括#  不会发送到服务端

9.
digg是网络最新名词，中文翻译为“掘客”，或者“顶格”，鼻祖是美国digg公司。
掘客类网站其实是一个文章投票评论站点，它结合了书签、博客、RSS 以及无等级的评论控制。它的独特在于它没有职业网站编辑，编辑全部取决于用户。用户可以随意提交文章，然后由阅读者来判断该文章是否有用，收藏文章的用户人数越多，说明该文章越有热点。即用户认为这篇文章不错，那么dig一下，当dig数达到一定程度，那么该文章就会出现在首页或者其他页面上。在一个掘客类网站上申请一个用户就可成为掘客，就象在博客网站上申请一个用户成为博客一样。

9.13
0.
1.CSS的class重复的话
它会从html文档从上往下，一个一个继承，碰到一样的属性，下面的代码覆盖上面的样式代码,
比如：
site.css里面.a{width:100px;height:100px;}   
base.css里面 ,a{width:200px;height:100px;}

<link href="css/sitte.css" rel="stylesheet" type="text/css" />
<link href="css/base.css" rel="stylesheet" type="text/css" />
如果你HTML里面是这样先后顺序的话，那 width：200px height:100px;
2.
http://localhost:8080/portal/index.html#/ifr/%252Fintegration%252Fpages%252Fmessage%252Fmessage.html

里面的%252F
用了URL二次编码
% 经过URL编码成%25
%2F
有的服务器不允许直接使用/   , 但是允许用它的ASCII码形式.
%2F表示ASCII码0x2F(47)对应的字符, 即/

3.
 data-bind属性是HTML5的新特性


9.14
0.
1.
我刚刚在chrome右键查看某网站源码的时候发现跟审查元素时html代码不一样
如右键查看时某一个标签a下没有源码，但是在审查元素时发现刚才标签a下有很多源码，于是我问我再次右键重新查看源码，标签a下任然没有源码，这是怎么回事啊？？它这样搞是不是为了防抓取？
动态生成的元素在查看源码的时候看不到的。目的应该是为了防止抓取。
查看源代码只能看到服务器向浏览器发送的代码，如果页面被js代码改变了，那自然就不一样了，与防抓取没有关系

所谓源码，就是别人服务器发送到浏览器的原封不动的代码。
你那些在源码中找不到的代码，那是在浏览器执行js动态生成的。
通过审查元素就能看到最终的html代码。

源码是从服务端接受过来的最原始的代码，F12之后是浏览器根据html,css,js渲染后的最终效果代码。
没有的原因是有的是ajax异步请求后用js动态添加上去的，不是为了防抓取是为了用户体验或节省服务器性能等原因考虑的

2.
每个frame元素或者iframe元素就是一个框架,这个框架是一个窗口,在这个窗口中加载一个html文档
3.
数据库一般术语中记录是一行,字段是一列,记录和字段在分别对应关系数据库中的属性和元组
4.
Portal 里面的全用配置集成单点登录是指的是表单提交（get/post），不是JSON提交，其次，验证结果
m:http://  其中的m指的是用fiddler抓包时候transport里面的Location，不加m:则该是
TextView里面的东西(有Transport则用它)

 

5.
<![CDATA[]]>这个标记所包含的内容将表示为纯文本，比如<![CDATA[<]]>表示文本内容“<”
6.
表单集成和插件集成区别在于 在小应用填写时候
/integration/integr/form/jira （表单集成）通过POST传递数据
/integration/integr/ticket/jira  （插件集成）通过HTTP传递数据
 

7.htm 和html
Htm是由于以前的操作系统不支持4位及以上后缀名而产生的，其他无区别
8.后缀名决定文件的打开方式，而不能决定文件的类型

9.15
0.
1. 在sublime text 3中，Preference, Settings-User，最后加上一行
"dpi_scale": 1.0

 

注意要在之前的最后一行加一个逗号
 

2.


9.17
0.
1.注意out.write输出是ASCII，要加“”
 

 

2.
jsp设置errorPage，isErrorPage
errorPage只适用于500的状态码，不适用于如404等其它状态码

全局的errorPage
 
3.
 

4.URL重写技术，对于浏览器禁用Cookie等，为了使用session，比如a标签跳转获取session参数，但是不推荐，因为超链如果太多了，重写太麻烦，还是采取通知用户不要禁止Cookie
 

 


9.18
0.
1.注意EL表达式能取到值得前提，必须将值放进域对象里面，同时相对应的属性必须提供get方法
 
2.
$里面是/运算符，注意取到的值会先转换为double再运算
3.
 
但是无法拿到PPT上说的map集合的key，Set集合无序，无法拿到

9.19
0.vendor 卖主，小贩，供应商
1.
Portal项目里面消息集成，内部代码根据isdel来判断是否返回给浏览器该消息
2.
MYSQL5.7安装，可能提示缺少某些dll，需要安装vs运行时库
遇到问题：
Q:在打开控制面板》》管理工具》》服务》》MySQL时，出现“本地计算机上的mysql服务启动后停止，某些服务在未由其他服务或程序使用时将自动停止。”
    或者在控制台net start MySQL时，出现MySQL服务无法启动，服务没有报告任何错误。
  
A:进入bin目录，执行一下初始化 mysqld --initialize，再次net start MySQL就解决了。（本人系统win7，版本MySQL 5.7.17，其余系统和版本应该也可以）
1、桌面左下角输入cmd
2、用cd命令进入安装mysql时的bin目录： cd C:\Program Files\MySQL\MySQL Server 5.7\bin (本人安装路径是C:\Program Files\MySQL\MySQL Server 5.7\bin，一般默认也是这个路径)
3、初始化data文件： mysqld --initialize（这个要等半分钟时间，没反应别以为是卡机了啊啊啊）
4、启动服务：net start MySQL，就成功啦~

Mysql安装好后默认密码是随机的，如何查看？
 

mysql> SET PASSWORD FOR 'root'@'localhost' = PASSWORD('newpass');

3.
注意如果license界面登录时候点击登录没反应，Network里面显示500内部错误，
是由于redis缓存造成的，需要清空redis缓存

注意redis-cli要再redis启动的情况下才能打开
redis 清空缓存
打开redis客户端运行命令
flushall ——> 清空整个 Redis 服务器的数据(删除所有数据库的所有 key )
flushdb ——> 清空当前数据库中的所有 key
4.
如果导入license显示成功，但是查看授权结果为空，则重启redis，zookeeper和license 服务器重新导入就可以了

5.
复制绿色版eclipse到其他电脑，出现问题
Eclipse的启动问题【an error has occurred see the log file】
解决办法：
删除eclipse的临时文件： eclipse/configuration 目录下的 org.eclipse.osgi org.eclipse.update 两个子目录
重新启动 eclipse

6.
OpenCV是一个基于BSD许可（开源）发行的跨平台计算机视觉库，可以运行在Linux、Windows、Android和Mac OS操作系统上。它轻量级而且高效——由一系列 C 函数和少量 C++ 类构成，同时提供了Python、Ruby、MATLAB等语言的接口，实现了图像处理和计算机视觉方面的很多通用算法。

7.
Test
 
 



9.21
0.
1.
https://my.oschina.net/u/3064445/blog/794975
HTML页面的标准文档流(默认布局)是：从上到下，从左到右，遇块级元素换行。所谓的浮动层就是给元素的float属性赋值后，就是脱离文档流，进行左右浮动，紧贴着父元素(默认为body文本区域)的左右边框。而此浮动元素在文档流空出的位置，由后续的(非浮动)元素填充上去：块级元素直接填充上去，若跟浮动元素的范围发生重叠，浮动元素覆盖块级元素。内联元素：有空隙就插入。
 

 

2.
webpack
 


9.22
0.
1.
 

 



9.25
0.
1.
URL后面加不加“/”有区别吗？
比如http://www.example.com和http://www.example.com/
前者是后者的省略形式，用浏览器（或命令行工具，比如 curl ）访问这个URL时，没有任何区别。
资源路径：就是 /path/to/xxx 这样的形式，最简单的路径就是 / 。根据 HTTP 协议，如果没有指定路径，则就等同于指定了 / 这样的路径。
2.
URL里面的分号";",有两种意思：
1，有意的，例如http://www.sample.com/test.php?valid_id=10;11;12
这里的分号是设计者用来作为分割符的吧。

2，转义符号结束。如http://www.sample.com/test.php?valid_id=11&amp;t=1
其中&amp; 代表&

3.
Jquery里面的$符号可以用在字符串里面
userpref_url="/integration/pages/approve/approve.html?w=500&amp;widgetId=${widgetId}"

9.30
0.optimize 是尽可能有效
1.

OCT.
10.1
0.
1.
Html5
 

 

 

Sublime text  快捷键 ctrl + shift +p 安装搜索install 在选择package 再安装sublime server插件（默认8080端口）
Sublime
先分屏显示，我们需要从视图（view）菜单设置，点击“view”——layout——Columns：2 ；快捷键是Alt+Shift+2；当然还可以设置多个 屏

 

 

10.3
0.
1.
有些浏览器不支持h5某些标签，怎么办
 

Html5shiv.js插件作用是不用重复写document.createElement()；帮我们写好了
 

点label会跳进文本框
 

for 属性规定 label 与哪个表单元素绑定。

标记通常以下面两种方式中的一种来和表单控件相联系：将表单控件作为标记标签的内容，这样的就是隐式形式，或者为 <label> 标签下的 for 属性命名一个目标表单 id，这样就是显式形式。

 

 

 
jQuery $符号功能强大，但是意味着效率不高


data-*自定义属性，没功能作用
 

 

 console.log()打印到谷歌浏览器控制台，打印的时候入data-age只会显示age，因为data-相当于一个规范，实际上就是age

 

控制台里面
  document.body 拿到body元素
再document.body.contentEditable=true; 富文本编译器

富文本编辑器，Rich Text Editor, 简称 RTE, 是一种可内嵌于浏览器，所见即所得的文本编辑器

新的表单元素
 

 

播放音频
 

Ctrl + d选中多个相同标签，Ctrl+k跳过其中下一个

 


Video
 
poster
 

 

 


 

Style里面的css覆盖掉行内级css，用！important ，老版本浏览器不支持

 


 

10.5
0.
1.
HTML5里面新的选择器
jQuery没用了
 

 


Ctrl+alt+N 是sublime 里面创建新文件，下面弹出一个路径框快捷键
同时也是NVDA启动快捷键

 

 

 



10.6
0.data[ ] ??? 其中data[ ]是由于引入了之前写的一个data.js里面的一个JSON对象
1.
dataset[‘’]获取data-属性，setAttribute设置属性
 

 



 
在js里面写window.location进行劫持


 

下面的写法不安全split，比如出现?t=,写js之前注意想想是否安全
 


10.7
0.
1.
 

 

 

全屏API
 


网页存储
 

伪元素::before的位置
 

Manifest清单文件
 

 
清单文件格式
 

Web Storage
 
Local Storage
 
Session Storage
 

 
文件系统
 

文件API

document.forms  等于document.getElementsByTagName()

 应该是forms[0]

10.9
0.
1.
NPM（node package manager），通常称为node包管理器。顾名思义，它的主要功能就是管理node包，包括：安装、卸载、更新、查看、搜索、发布等。
2.
JS对象字面量
 

//利用prototype属性可以添加公有属性和方法
如：
myConstructor2.prototype={
19 propertyA: sha ,
20 propertyB: feng ,
21 methodA:function(){
22 alert(this.propertyA+ +this.propertyB);
23 },
24 methodB:function(){}
25 }

3.
clear清除所有的key/value
用途：清除所有的key/value
用法：.clear()
代码示例：
	sessionStorage.clear(); 	localStorage.clear();


10.10
0.
1,
CommonJS是一种规范，NodeJS是这种规范的实现。CommonJS是一 个不断发展的规范

CommonJS有很多实现，其中不乏很多大名鼎鼎的项目，比如 说：Apache的CouchDB和node.js等。但这些项目大 部分只实现了CommonJS的部分规范。
10.11
0.
1.
 

10.12
0.
1.
       Keyword=require('text!../../html/context.html'),  //用text.js引入模板文件，这里的格式是：“text.js的ID+!+模板路径“，
                                                                               //“text!../../html/context.html”中，"text"是mainFrame中定义的text.js的moduleID，并不是固定用“text”，
                                                                               //“！”用于分隔moduleID和路径，后面模板的路径是相对于当前文件的路径，这个就是相对于mainContext.js的
                                                                              //路径，具体可在上面的结构目录中对比一下。

2.
Reuqirejs有一个text的插件，它可以读取指定文件的内容，读取到的内容就是文本。

define(function(require){ 
var html = require("text!html/test.html");
 console.log(html); 
});

3.
$(document).ready(function(){
  $(".btn1").click(function(){
    $("p").slideToggle();
  });
});
当 DOM（文档对象模型） 已经加载，并且页面（包括图像）已经完全呈现时，会发生 ready 事件。
由于该事件在文档就绪后发生，因此把所有其他的 jQuery 事件和函数置于该事件中是非常好的做法。正如上面的例子中那样。
ready() 函数规定当 ready 事件发生时执行的代码。
ready() 函数仅能用于当前文档，因此无需选择器。
 

4.
MVVM(ModelViewViewModel)是一种帮助开发者将数据从模型分离的设计模式。

10.13
0.  How can I start addressing this?   我如何开始解决这个问题吗？
1.解决如输入错误密码的提示在左下角的问题
 

2.
Hbase的名字的来源是Hadoop database，即hadoop数据库。
HBase是一个分布式的、面向列的开源数据库

10.16
0.
1.
exponent，modules
 
跨域
 

2.
工单测试环境：http://123.103.9.208:90/ticket/index.html（外网IP）
映射对应的内网IP是：172.20.8.76（调试端口为8000），注意调试不能用外网IP

3.
工单ticket等是项目是Maven工程，在eclipse里面导入项目时候别用普通的导入法，
用：
 

4.
 
4.
RDB：Relational Database关系型数据库

10.18
1.
在WORD里拖动鼠标滑轮,页面不上上下走,而是放大缩小,怎么回事
因为按着了Ctrl键
2.
用了redis是否就不需要用solr类似的检索引擎了
两者的作用时不一样的，一个用来做数据缓存，一个用来做搜索。
分别提高了数据的访问速度和检索速度。


10.23
1.
Java的serialization提供了一种持久化对象实例的机制。当持久化对象时，可能有一个特殊的对象数据成员，我们不想用serialization机制来保存它。为了在一个特定对象的一个域上关闭serialization，可以在这个域前加上关键字transient。当一个对象被序列化的时候，transient型变量的值不包括在序列化的表示中，然而非transient型的变量是被包括进去的。
2.
Servlet容器：比如Tomcat，JBOSS

10.24
1.
Apache Shiro（日语“堡垒（Castle）”的意思）是一个强大易用的Java安全框架，提供了认证、授权、加密和会话管理功能，可为任何应用提供安全保障 - 从命令行应用、移动应用到大型网络及企业应用。
Shiro为解决下列问题（我喜欢称它们为应用安全的四要素）提供了保护应用的API：
认证 - 用户身份识别，常被称为用户“登录”；
授权 - 访问控制；
密码加密 - 保护或隐藏数据防止被偷窥；
会话管理 - 每用户相关的时间敏感的状态。
Shiro还支持一些辅助特性，如Web应用安全、单元测试和多线程，它们的存在强化了上面提到的四个要素。

10.25
1.
[solr] - 索引数据删除

<delete><id>1</id></delete>
<commit/>
或者
<delete><query>id:1</query></delete>
<commit/>

删除所有索引，这样写就可以了：
<delete><query>*:*</query></delete>
<commit/>
注意：这个<commit/>节点不能少，否则删除动作的事务不会提交。

10.27
1.
context-param和init-param区别 
web.xml里面可以定义两种参数： 
(1)application范围内的参数，存放在servletcontext中，在web.xml中配置如下： 
<context-param> 
           <param-name>context/param</param-name> 
           <param-value>avalible during application</param-value> 
</context-param> 
(2)servlet范围内的参数，只能在servlet的init()方法中取得，在web.xml中配置如下： 
<servlet> 
    <servlet-name>MainServlet</servlet-name> 
    <servlet-class>com.wes.controller.MainServlet</servlet-class> 
    <init-param> 
       <param-name>param1</param-name> 
       <param-value>avalible in servlet init()</param-value> 
    </init-param> 
    <load-on-startup>0</load-on-startup> 
</servlet> 

10.30
1.
StringUtils.isEmpty(str)可以避免每次都是用“”.equals(str)||str==null。
NOV.
11.1
1.
调整Portal首页图片大小
 

2.
CSS3中的background-size

 

11.2
1.
SCM（Software Configuration Management，软件配置管理）
2.
服务器发送给浏览器的响应是没有没有JS，CSS和图片等外部资源的，浏览器在解析响应时才会再次请求这些资源
3.
在JSP出现之前，web容器也叫Servlet容器
4.
在JSP出现之前，web容器也叫Servlet容器
5.
CORS是一个W3C标准，全称是”跨域资源共享”（Cross-origin resource sharing）
6.
软件开发工具包（外语首字母缩写：SDK、外语全称：Software Development Kit）一般都是一些软件工程师为特定的软件包、软件框架、硬件平台、操作系统等建立应用软件时的开发工具的集合

软件开发工具包括广义上指辅助开发某一类软件的相关文档、范例和工具的集合。
7.
serialVersionUID适用于Java的序列化机制。简单来说，Java的序列化机制是通过判断类的serialVersionUID来验证版本一致性的。在进行反序列化时，JVM会把传来的字节流中的serialVersionUID与本地相应实体类的serialVersionUID进行比较，如果相同就认为是一致的，可以进行反序列化，否则就会出现序列化版本不一致的异常，即是InvalidCastException。

具体的序列化过程是这样的：序列化操作的时候系统会把当前类的serialVersionUID写入到序列化文件中，当反序列化时系统会去检测文件中的serialVersionUID，判断它是否与当前类的serialVersionUID一致，如果一致就说明序列化类的版本与当前类版本是一样的，可以反序列化成功，否则失败。

serialVersionUID有两种显示的生成方式：        
一是默认的1L，比如：private static final long serialVersionUID = 1L;        
二是根据类名、接口名、成员方法及属性等来生成一个64位的哈希字段，比如：        
private static final  long   serialVersionUID = xxxxL;

11.3
0.
Autodetected  自动检测   banner 横幅，标语
1.
&nbsp|&quot|&amp|&lt|&gt等html字符转义

http://blog.csdn.net/wusuopubupt/article/details/8817826
 
2.
Servlet2.5对应Javaee1.5
Servlet3.0对应Javaee1.6

11.4
1.
rt.jar rt:runtime
2.
近弄webservice，我使用的jdk自带的wsimport工具来生成客户端代码，发现生成的代码具有编译错误，错误描述如下：
The method getPort(QName, Class<T>) in the type Service is not applicable for the arguments (QName, Class<SCServicePortType>, WebServiceFeature[]).
而我单独创建新的项目来测试生成的客户端代码却没有这样的错误，所以错误原因在于jar包冲突.....
 
几近周折，终于让我发现，原来javax.xml.ws.Service这个类，即存在于jdk自带的rt.jar中，也存在于我项目引用包jaxws-api.jar，这种情况就是两个jar包中存在包名和类名都完全相同的问题。我需要的是rt.jar中的javax.xml.ws.Service类，但它却自动引入了jaxws-api.jar的javax.xml.ws.Service类，但是这两个jar包都不能去掉。
所以，只有改变编译器优先选择的jar顺序（这个顺序是可以改变的）：在Eclipse中是在Java Build Path-》Order and Export里面，通过"up"/"down"按钮改变顺序，把jaxws-api.jar放在jdk的下面就可以了。

11.6
1.
元数据（Metadata），又称中介数据、中继数据，为描述数据的数据（data about data），主要是描述数据属性（property）的信息，用来支持如指示存储位置、历史数据、资源查找、文件记录等功能。
2.
Xml文件可以描述层级关系，而.properties文件很难

11.7
1.
RPC（Remote Procedure Call Protocol）——远程过程调用协议，它是一种通过网络从远程计算机程序上请求服务，而不需要了解底层网络技术的协议。RPC协议假定某些传输协议的存在，如TCP或UDP
RPC是指远程过程调用，也就是说两台服务器A，B，一个应用部署在A服务器上，想要调用B服务器上应用提供的函数/方法，由于不在一个内存空间，不能直接调用，需要通过网络来表达调用的语义和传达调用的数据
2.
如何在html中禁止文字的复制

可以禁止用户右键，使用js操作禁止，参考以下代码

<script type="text/javascript">
document.oncontextmenu=function(e){return false;}
</script>  
<body onselectstart="return false">


也可以直接禁止用户选中页面从而实现禁止复制的目的，可以在css里面操作禁止，参考以下代码
body {  
    -webkit-touch-callout: none;  
    -webkit-user-select: none;  
    -khtml-user-select: none;  
    -moz-user-select: none;  
    -ms-user-select: none;  
    user-select: none;  
}


以下 js 代码复制到你的 js 文件中（这段代码是针对IE的，chrome也可以）：
<script language="javascript"> 
document.onselectstart=new Function("event.returnValue=false;"); //禁止选择,也就是无法复制 
</script> 

将以下代码复制到你的 css 文件中（这段代码是针对firefox的）

11.8
1.
如何突破360图书馆复制弹出一个框从而不能复制的问题？
方法二：打开想要复制的文章，在网页空白处点击右键，选择打印项；选择打印之后会弹出要打印的页面，选择要复制的内容，点击右键，选择复制即可。
方法三：控制台中输入document.body.oncopy=null;
2.
OAUTH协议为用户资源的授权提供了一个安全的、开放而又简易的标准。与以往的授权方式不同之处是OAUTH的授权不会使第三方触及到用户的帐号信息（如用户名与密码），即第三方无需使用用户的用户名与密码就可以申请获得该用户资源的授权，因此OAUTH是安全的。OAuth是Open Authorization的简写。
3.
JPA是Java Persistence API的简称，中文名Java持久层API，是JDK 5.0注解或XML描述对象－关系表的映射关系，并将运行期的实体对象持久化到数据库中
4.
 在使用springmvc框架的时候，在处理json的时候需要用到spring框架特有的注解@ResponseBody或者@RestController注解，
这两个注解都会处理返回的数据格式，使用了该类型注解后返回的不再是视图，不会进行转跳，而是返回json或xml数据格式，输出在
页面上。
  @ResponseBody，一般是使用在单独的方法上的，需要哪个方法返回json数据格式，就在哪个方法上使用，具有针对性。

 @RestController，一般是使用在类上的，它表示的意思其实就是结合了@Controller和@ResponseBody两个注解，
如果哪个类下的所有方法需要返回json数据格式的，就在哪个类上使用该注解，具有统一性；需要注意的是，使用了@RestController
注解之后，其本质相当于在该类的所有方法上都统一使用了@ResponseBody注解，所以该类下的所有方法都会返回json数据格式，
输出在页面上，而不会再返回视图。
5.
很多朋友在用github管理项目的时候，都是直接使用https url克隆到本地，当然也有有些人使用 SSH url 克隆到本地。然而，为什么绝大多数人会使用https url克隆呢？
这是因为，使用https url克隆对初学者来说会比较方便，复制https url 然后到 git Bash 里面直接用clone命令克隆到本地就好了。而使用 SSH url 克隆却需要在克隆之前先配置和添加好 SSH key 。
因此，如果你想要使用 SSH url 克隆的话，你必须是这个项目的拥有者。否则你是无法添加 SSH key 的。

https 和 SSH 的区别：
1、前者可以随意克隆github上的项目，而不管是谁的；而后者则是你必须是你要克隆的项目的拥有者或管理员，且需要先添加 SSH key ，否则无法克隆。
2、https url 在push的时候是需要验证用户名和密码的；而 SSH 在push的时候，是不需要输入用户名的，如果配置SSH key的时候设置了密码，则需要输入密码的，否则直接是不需要输入密码的。


6.
线程的最主要目的是提高程序的运行性能，但性能的提升会导致复杂性的提升，又会导致安全性和活跃性的风险

可伸缩性指的是：当增加计算资源时（例如CPU、内存、存储容量或I/O带宽），程序的吞吐量或者处理能力响应地增加

https://www.cnblogs.com/HectorHou/p/6040872.html

11.9
1.
“为什么我们要用node.js？”，别人一般会告诉你：node.js有非阻塞，事件驱动I/O等特性，从而让高并发（high concurrency）在的轮询（Polling）和comet构建的应用中成为可能。
服务器只在用户那边有事件发生的时候才响应，这就是事件驱动
一种javascript的运行环境，能够使得javascript脱离浏览器运行。
2.
ECMAScript 6（以下简称ES6）是JavaScript语言的下一代标准。因为当前版本的ES6是在2015年发布的，所以又称ECMAScript 2015。
11.10
1.
关于Define，它需要有一个返回值/对象，且只能有一个返回值/对象，这一点却是好多帖子没有提到的，但又非常重要的，一不留神就会报错。

要想在main.js里能随意调用lzd.js中的lzd123或lzd456方法，就需要把他们糅合到一个对象里给返回去，细想一下，返回的对象里有方法，有属性可以使用，这就是所谓的模块化吧！
2.
脚本，是使用一种特定的描述性语言，依据一定的格式编写的可执行文件，又称作宏或批处理文件。

11.13
1.
 
2.
11.14
1.
为什么说 MD5 是不可逆的？
改个老梗作为栗子吧，【世界上只有一个我，但是但是妞却是非常非常多的，以一个有限的我对几乎是无限的妞，所以可能能搞定非常多（100+）的妞，这个理论上的确是通的，可是实际情况下....】

11.15
1.
出现错误原因是js文件保存字符编码不对，应该改为utf-8
 
2.
注意js <script>的位置要在加载的HTML标签元素后面，或者是用window.onload

比如下面就是script在HTML上面导致的错误
 
11.16
11.17
11.20
1.
在JVM中，类从被加载到虚拟机内存中开始，到卸载出内存为止，它的整个生命周期包括：加载、验证、准备、解析、初始化、使用和卸载7个阶段。而解析阶段即是虚拟机将常量池内的符号引用替换为直接引用的过程。
1.符号引用（Symbolic References）：符号引用以一组符号来描述所引用的目标，符号可以是任何形式的字面量，只要使用时能够无歧义的定位到目标即可。例如，在Class文件中它以CONSTANT_Class_info、CONSTANT_Fieldref_info、CONSTANT_Methodref_info等类型的常量出现。符号引用与虚拟机的内存布局无关，引用的目标并不一定加载到内存中。在Java中，一个java类将会编译成一个class文件。在编译时，java类并不知道所引用的类的实际地址，因此只能使用符号引用来代替。比如org.simple.People类引用了org.simple.Language类，在编译时People类并不知道Language类的实际内存地址，因此只能使用符号org.simple.Language（假设是这个，当然实际中是由类似于CONSTANT_Class_info的常量来表示的）来表示Language类的地址。各种虚拟机实现的内存布局可能有所不同，但是它们能接受的符号引用都是一致的，因为符号引用的字面量形式明确定义在Java虚拟机规范的Class文件格式中。
2.直接引用：
 直接引用可以是
（1）直接指向目标的指针（比如，指向“类型”【Class对象】、类变量、类方法的直接引用可能是指向方法区的指针）
（2）相对偏移量（比如，指向实例变量、实例方法的直接引用都是偏移量）
（3）一个能间接定位到目标的句柄

直接引用是和虚拟机的布局相关的，同一个符号引用在不同的虚拟机实例上翻译出来的直接引用一般不会相同。如果有了直接引用，那引用的目标必定已经被加载入内存中了

2.
移动设备管理（Mobile Device Management，简称MDM）

11.22
1. add to explorer context menu
上下文菜单（context menu），Windows操作系统中任何地方右击鼠标会出现俗称的“右键菜单”，其实就是指上下文菜单。因为上下文菜单根据鼠标位置来判断弹出什么的菜单（如桌面右击显示个性化菜单，文件右击则显示针对文件操作删除等的菜单）也就是
2.
RIA（Rich Internet Applications）丰富互联网程序，具有高度互动性、丰富用户体验以及功能强大的客户端。
11.23
1.
将类的二进制数据中的符号引用替换为直接引用
     在java中，一个java类将会编译成一个class文件。在编译时，java类并不知道引用类的实际内存地址，因此只能使用符号引用来代替。比如org.simple.People类引用org.simple.Tool类，在编译时People类并不知道Tool类的实际内存地址，因此只能使用符号org.simple.Tool(假设)来表示Tool类的地址。而在类装载器装载People类时，此时可以通过虚拟机获取Tool类 的实际内存地址，因此便可以既将符号org.simple.Tool替换为Tool类的实际内存地址，即直接引用地址

11.24
1.
什么是跨域？
跨域，指的是浏览器不能执行其他网站的脚本。它是由浏览器的同源策略造成的，是浏览器对javascript施加的安全限制。所谓同源是指，域名，协议，端口均相同，不明白没关系，举个栗子：
请注意：localhost和127.0.0.1虽然都指向本机，但也属于跨域。
浏览器执行javascript脚本时，会检查这个脚本属于哪个页面，如果不是同源页面，就不会被执行。

11.27
 
1.strictfp, 即 strict float point (精确浮点)。
　　strictfp 关键字可应用于类、接口或方法。使用 strictfp 关键字声明一个方法时，该方法中所有的float和double表达式都严格遵守FP-strict的限制,符合IEEE-754规范。当对一个类或接口使用 strictfp 关键字时，该类中的所有代码，包括嵌套类型中的初始设定值和代码，都将严格地进行计算。严格约束意味着所有表达式的结果都必须是 IEEE 754 算法对操作数预期的结果，以单精度和双精度格式表示。
　　如果你想让你的浮点运算更加精确，而且不会因为不同的硬件平台所执行的结果不一致的话，可以用关键字strictfp. 
2.
2.transient
当串行化某个对象时，如果该对象的某个变量是transient，那么这个变量不会被串行化进去。也就是说，假设某个类的成员变量是transient，那么当通过
ObjectOutputStream把这个类的某个实例
保存到磁盘上时，实际上transient变量的值是不会保存的。因为当从磁盘中读出这个对象的时候，对象的该变量会没有被赋值。
    另外这篇文章还提到，当从磁盘中读出某个类的实例时，实际上并不会执行这个类的构造函数，而是读取这个类的实例的状态，并且把这个状态付给这个类的对象。
3.
volatile的作用是作为指令关键字，确保本条指令不会因编译器的优化而省略，且要求每次直接读值。
volatile的变量是说这变量可能会被意想不到地改变，这样，编译器就不会去假设这个变量的值了


4.
领域模型中的实体类分为四种类型：VO、DTO、DO、PO，各种实体类用于不同业务层次间的交互，并会在层次内实现实体类之间的转化。

VO（View Object）：视图对象，用于展示层，它的作用是把某个指定页面（或组件）的所有数据封装起来。
DTO（Data Transfer Object）：数据传输对象，这个概念来源于J2EE的设计模式，原来的目的是为了EJB的分布式应用提供粗粒度的数据实体，以减少分布式调用的次数，从而提高分布式调用的性能和降低网络负载，但在这里，我泛指用于展示层与服务层之间的数据传输对象。
DO（Domain Object）：领域对象，就是从现实世界中抽象出来的有形或无形的业务实体。
PO（PersistentObject）：持久化对象，它跟持久层（通常是关系型数据库）的数据结构形成一一对应的映射关系，如果持久层是关系型数据库，那么，数据表中的每个字段（或若干个）就对应PO的一个（或若干个）属性。
https://www.cnblogs.com/feng9exe/p/5621269.html
5.
首先了解什么叫RPC，为什么要RPC，RPC是指远程过程调用，也就是说两台服务器A，B，一个应用部署在A服务器上，想要调用B服务器上应用提供的函数/方法，由于不在一个内存空间，不能直接调用，需要通过网络来表达调用的语义和传达调用的数据。
6.
方法签名由方法名称和一个参数列表（方法的参数的顺序和类型）组成。
注意，方法签名不包括方法的返回类型。不包括返回值和访问修饰符。
7.
【强制】 Object 的 equals 方法容易抛空指针异常，应使用常量或确定有值的对象来调用equals 。
正例： " test " .equals(object);
反例：  object.equals( " test " );
说明：推荐使用 java . util . Objects # equals （JDK 7 引入的工具类 ）
8.
【强制】所有的相同类型的包装类对象之间值的比较，全部使用 equals 方法比较。
说明：对于 Integer var  = ?在-128 至 127 之间的赋值， Integer 对象是在
IntegerCache . cache 产生，会复用已有对象，这个区间内的 Integer 值可以直接使用==进行
判断，但是这个区间之外的所有数据，都会在堆上产生，并不会复用已有对象，这是一个大坑，
推荐使用 equals 方法进行判断。

9.
java.lang.NullPointerException
NPE ，空值异常，阿里规范文档里面的名词
白话阿里巴巴Java开发手册（编程规约） - 行业新闻 - 重庆果动科技有限公司http://www.guodongkeji.com/newsshow-24-2265-1.html
10.
抽象类是不能被实例化的。但抽象类是否可以有构造函数？答案是可以有。抽象类的构造函数用来初始化抽象类的一些字段，而这一切都在抽象类的派生类实例化之前发生。不仅如此，抽线类的构造函数还有一种巧妙应用：就是在其内部实现子类必须执行的代码。
11.
MySQL数据库中的Date,DateTime,TimeStamp和Time类型

DATETIME类型用在你需要同时包含日期和时间信息的值时。MySQL检索并且以'YYYY-MM-DD HH:MM:SS'格式显示DATETIME值，支持的范围是'1000-01-01 00:00:00'到'9999-12-31 23:59:59'。（“支持”意味着尽管更早的值可能工作，但不能保证他们可以。）
DATE类型用在你仅需要日期值时，没有时间部分。MySQL检索并且以'YYYY-MM-DD'格式显示DATE值，支持的范围是'1000-01-01'到'9999-12-31'。
TIMESTAMP列类型提供一种类型，你可以使用它自动地用当前的日期和时间标记INSERT或UPDATE的操作。
如果你不分配一个值，表中的第一个TIMESTAMP列自动设置为最近操作的日期和时间。
　　也可以通过分配一个NULL值，将TIMESTAMP列设置为当前的日期和时间
TIME数据类型表示一天中的时间。MySQL检索并且以"HH:MM:SS"格式显示TIME值。支持的范围是'00:00:00'到'23:59:59'。
12.
为什么要将Runnable接口的子类对象传递给Thread的构造函数。
   因为，自定义的run方法所属的对象是Runnable接口的子类对象。
所以要让线程去指定对象的run方法。就必须明确该run方法所属对象。
13.
面试题之String str = new String("abc"); 创建了几个对象
两个或一个，得看之前“abc”是否用过，没用过就是两个，用过就是一个
11.28
1.
有了垃圾回收机制为什么还要调用close方法进行关闭？
垃圾回收器只能处理java虚拟机所产生的内存垃圾 而流所消耗的操作系统资源、硬件、网络资源等的外部资源 这不是java虚拟机能管的 当然也不是垃圾回收器能处理的
思考：
有了垃圾回收机制为什么还要调用close方法进行关闭。
答：垃圾回收机制是用来回收不再使用的对象。不会回收未关闭的资源。而IO操作中的流访问的是文件资源，如果不关闭，就仍然有对象引用指向它，也就不会被回收。所以必须关闭。
为什么IO异常一定要处理。
答：发生了IO异常，程序就会终止运行。
2.
思考：
在加载文件时候是否是将文件全部加载进流
答：不会，读取的时候加载。
为什么定义数组，要定义多大呢？
答：为了缓冲。先把数据读到缓冲数组中，缓冲区满了或到达文件末尾了就输出。缓冲数组的大小没有规定，但一般会定义为1024。太小的话体现不了缓冲的效率，太大的话会加剧内存的负担甚至内存溢出。
注意：
定义文件路径时，可以用“/”或者“\\”。
在创建一个文件时，如果目录下有同名文件将被覆盖。
在读取文件时，必须保证该文件已存在， 否则出异常。 
 
3.
 用GBK编码，再用ISO8859-1解码，得到乱码。解决办法：
对得到的乱码用ISO8859-1编码，可复原，再用GBK解码即可。
（注意：ISO-8859-1编码是单字节编码，向下兼容ASCII）

4.
操作系统中会有一块地方，称作剪贴板（clipboard），专门用来处理复制粘贴。
不同系统的细节可能会不同，但大致上是这样的：
•	复制文本时，会把所复制的文本克隆一份到剪贴板里面。粘贴文本时，再将剪贴板里的文本克隆到所粘贴应用程序之中；
o	复制文本时会保留其样式（比如在 Office 软件中复制，也会存储字体、字号等等信息，复制到剪贴板的实质上是一种「标记语言」）。但粘贴时若应用程序（比如记事本）不支持这些样式，则会去掉样式；
o	复制图片、混合富文本时，也是同样先克隆到剪贴板里。
•	复制文件时，系统只会把文件的路径复制到剪贴板，等到粘贴时再分情况处理：
o	同一分区下，粘贴（或剪切）文件，都不会真正在存储设备里直接克隆、挪动，而是更改此文件的路径（path）属性。当然这与不同文件系统的具体实现有关；
	（这也就是为什么，「复制 → 删除复制源文件 → 粘贴」这个操作会在大部分系统中失效了）
o	不同分区下，粘贴（或剪切）文件，会重新开辟空间，然后克隆文件；
o	涉及到与其他设备（即插即用设备等）之间的复制粘贴则更加复杂，实现各有不同。
•	还要考虑的情况，就是涉及虚拟机、远程主机的复制粘贴机制。虚拟机软件、远程主机软件都会有一个「介于两系统之间的」剪贴板，「连接起」这两个系统的各自剪贴板，并做一些编码格式转换的工作。
o	关于虚拟机复制粘贴，更具体的细节可以看这里：Is it possible to copy paste between Mac OS and its virtual machine? 各软件实现有异。
	
5.
静态、自适应、流式、响应式四种网页布局有什么区别？

响应式与自适应的原理是相似的，都是检测设备，根据不同的设备采用不同的css，而且css都是采用的百分比的，而不是固定的宽度，不同点是响应式的模板在不同的设备上看上去是不一样的，会随着设备的改变而改变展示样式，而自适应不会，所有的设备看起来都是一套的模板，不过是长度或者图片变小了，不会根据设备采用不同的展示样式，流式就是采用了一些设置，当宽度大于多少时怎么展示，小于多少时怎么展示，而且展示的方式向水流一样，一部分一部分的加载，静态的就是采用固定宽度的了。
6.
问题：对于Web服务器而言，当有多个客户端同时访问服务器时，服务端又如何提供服务呢？
答：通过线程来提供服务。每接收一个客户端请求，就new一个线程与其通讯。

7.
调试
 手动添加断点:  在你想设置断点的地方 手动输入 debugger;  chrome浏览器 支持 直接 修改 js 文件 直接生效 ,不需要再次刷新页面 ; 
jsp 实质是一个 .java 文件 ,所以 js 支持 直接修改 ; jsp 就不支持 直接修改 ; 所以: 这样也是将 js  和 jsp 分属不同文件的好处 ;
8.
11.29
1.
跨站脚本攻击(Cross Site Scripting)，为了不和层叠样式表(Cascading Style Sheets, CSS)的缩写混淆，故将跨站脚本攻击缩写为XSS。恶意攻击者往Web页面里插入恶意Script代码，当用户浏览该页之时，嵌入其中Web里面的Script代码会被执行，从而达到恶意攻击用户的目的。
2.
ESAPI是一个免费、开源的Web应用程序安全控制组件，可以帮助编程人员开发低风险应用程序。
ESAPI是OWASP组织的一个开源项目，网址是： http://www.owasp.org/index.php/ESAPI

3.
对于测试，有着非常多的资料，也有着非常成熟的理论体系。而且还有一种开发方式叫做“Test-Driven Development”，即“测试驱动开发”，通常也被简称为TDD。其大致思想是，在开发功能代码之前，先编写测试的代码，再编写功能代码，也就是所谓”测试先行”。

11.30
1.
当你有一组应用程序接口（API）只允许用Writer或Reader作为输入，但你又想使用String，这时可以用StringWriter或StringReader。
Writer和Reader类是设计来处理基于字符串的输入和输出的。InputStream和OutputStream类则应该用于处理基于字节的I/O。在这个层次的类中，可以用ByteArrayInputStream和ByteArrayOutputStream来达到StringReader和StringWriter的类似效果。
https://www.cnblogs.com/robbinluobo/p/6594925.html
2.
java web开发常见漏洞攻击及解决办法
1.弱口令漏洞
解决方案：
最好使用至少6位的数字、字母及特殊字符组合作为密码。数据库不要存储明文密码，应存储MD5加密后的密文，由于目前普通的MD5加密已经可以被破解，最好可以多重MD5加密。

2.未使用用户名及密码登录后台 ，可直接输入后台URL登录系统。
解决方案：
通过配置filter来过滤掉无效用户的连接请求。

3．JSP页面抛出的异常可能暴露程序信息。有经验的入侵者，可以从JSP程序的异常中获取很多信息，比如程序的部分架构、程序的物理路径、SQL注入爆出来的信息等。
解决方案：
自定义一个Exception，将异常信息包装起来不要抛到页面上。

4.合法用户“注销”后，在未关闭浏览器的情况下，点击浏览器“后退”按钮，可从本地页面缓存中读取数据，绕过了服务端filter过滤。
解决方案：
配置filter对存放敏感信息的页面限制页面缓存。如：
httpResponse.setHeader("Cache-Control","no-cache"); 
httpResponse.setHeader("Cache-Control","no-store");
httpResponse.setDateHeader("Expires", 0);
httpResponse.setHeader("Pragma","no-cache");
5.SQL注入漏洞。
解决方案：
在数据库访问层中不要使用“+”来拼接SQL语句！如：
String sql= “SELECT * FROM USERS WHERE 1=1”;
if(null != user.getUserName() && !””.equals(user.getUserName())){
	sql += “ and UNAME = ‘”+user.getUserName()+”’”;
}
而应使用PreparedStatement。如：
PreparedStatement pstmt = con.prepareStatement("SELECT * FROM USERS WHERE UNAME=?");
pstmt.setString(1, “Neeke”);
如果项目中使用了Hibernate框架，则推荐使用named parameter。如：
String queryString = "from Users where uname like :name";
冒号后面是一个named parameter，我们可以使用Query接口将一个参数绑定到name参数上：
List result = session.createQuery(queryString)
                  .setString("name", user.getUserName())
                  .list();
6.文件上传漏洞。前台仅使用JS对文件后缀做了过滤，这只能针对普通的用户，而恶意攻击者完全可以修改表单去掉JS校验。
解决方案：
前台JS过滤加服务器端程序过滤。具体过滤掉哪些文件类型视具体情况而定。

7.可执行脚本漏洞。对用户提交的数据未转义，一些用户提交的含有JavaScript脚本的信息被直接输出到页面中从而被浏览器执行。
解决方案：
使用org.apache.commons.lang.StringEscapeUtils对用户提交的数据进行转义。如：
@RequestMapping(params="method=addTopic",method=RequestMethod.POST)
public ModelAndView addTopic(HttpServletRequest request, HttpServletResponse response, BbsTopic topic)
{
BaseAdmin user = (BaseAdmin) request.getSession().getAttribute(Constant.SESSION_USER);
topic.setBaseAdmin(user);
topic.setTopicDate(new Timestamp(System.currentTimeMillis()));
topic.setTopicContent(StringEscapeUtils.escapeHtml(topic.getTopicContent()));
topic.setTopicTitle(StringEscapeUtils.escapeHtml(topic.getTopicTitle()));
this.bbsTopicService.save(topic);
return new ModelAndView(new RedirectView("bbs.do?method=topicList&bfid="+ topic.getBfid()));
}
如果前台不限制特殊字符，在我们页面输出的时候，可以采用jstl标签得输出标签来过滤字符，${}是el表达式，默认不过滤特殊符号的，但是你可以使用<c:out value='${}'/> 过滤特殊符号。

3.
<meta> 元素可提供有关页面的元信息（meta-information），比如针对搜索引擎和更新频度的描述和关键词。
<meta> 标签位于文档的头部，不包含任何内容。<meta> 标签的属性定义了与文档相关联的名称/值对。

4.
CSS min-height 属性
该属性值会对元素的高度设置一个最低限制。因此，元素可以比指定值高，但不能比其矮。不允许指定负值
DEC.
12.1
1.
URL 只能使用 ASCII 字符集.
来通过因特网进行发送。由于 URL 常常会包含 ASCII 集合之外的字符，URL 必须转换为有效的 ASCII 格式。
URL 编码使用 "%" 其后跟随两位的十六进制数来替换非 ASCII 字符。
URL 不能包含空格。URL 编码通常使用 + 来替换空格。

12.4
1.
.dropdown:hover .dropdown-content {
  display: block;
}

注意class直接没有逗号，这只是一个class（父->子的筛选）

12.5
1.
    一般情况下，一旦Web服务器向浏览器发送了请求数据，它就要关闭TCP连接，然后如果浏览器或者服务器在其头信息加入了这行代码
    Connection:keep-alive
   TCP连接在发送后将仍然保持打开状态，于是，浏览器可以继续通过相同的连接发送请求。保持连接节省了为每个请求建立新连接所需的时间，还节约了网络带宽。
2.
伪类选择元素基于的是当前元素处于的状态，或者说元素当前所具有的特性，而不是元素的id、class、属性等静态的标志。由于状态是动态变化的，所以一个元素达到一个特定状态时，它可能得到一个伪类的样式；当状态改变时，它又会失去这个样式。由此可以看出，它的功能和class有些类似，但它是基于文档之外的抽象，所以叫伪类。
与伪类针对特殊状态的元素不同的是，伪元素是对元素中的特定内容进行操作，它所操作的层次比伪类更深了一层，也因此它的动态性比伪类要低得多。实际上，设计伪元素的目的就是去选取诸如元素内容第一个字（母）、第一行，选取某些内容前面或后面这种普通的选择器无法完成的工作。它控制的内容实际上和元素是相同的，但是它本身只是基于元素的抽象，并不存在于文档中，所以叫伪元素。

12.6
1.
JS对代码行进行折行
您可以在文本字符串中使用反斜杠对代码行进行换行。下面的例子会正确地显示：
document.write("你好 \
世界!");
不过，您不能像这样折行：
document.write \ 
("你好世界!");

2.
提示：JavaScript 是脚本语言。浏览器会在读取代码时，逐行地执行脚本代码。而对于传统编程来说，会在执行前对所有代码进行编译。
3.
如果用户不能确定浏览器是否支持JavaScript脚本，那么可以应用HTML提供的注释符号进行验证。HTML注释符号是以 <-- 开始以 --> 结束的。如果在此注释符号内编写 JavaScrip t脚本，对于不支持 JavaScript 的浏览器，将会把编写的 JavaScript 脚本作为注释处理。
使用 JavaScript 脚本在页面中输出一个字符串，将 JavaScript 脚本编写在 HTML 注释中，如果浏览器支持 JavaScript 将输出此字符串，如果不支持将不输出此字符串，代码如下:
<script>
<!--
document.write("您的浏览器支持JavaScript脚本!");
//-->
</script>
4.
重新声明 JavaScript 变量
如果重新声明 JavaScript 变量，该变量的值不会丢失：
在以下两条语句执行后，变量 carname 的值依然是 "Volvo"：
var carname="Volvo"; 
var carname;

5.
您可以在字符串中使用引号，只要不匹配包围字符串的引号即可：
实例
var answer="It's alright";
var answer="He is called 'Johnny'";
var answer='He is called "Johnny"';
6．
JavaScript 数字
JavaScript 只有一种数字类型。数字可以带小数点，也可以不带：
实例
var x1=34.00;      //使用小数点来写
var x2=34;         //不使用小数点来写
极大或极小的数字可以通过科学（指数）计数法来书写：
实例
var y=123e5;      // 12300000
var z=123e-5;     // 0.00123
7.
JavaScript 对象
对象由花括号分隔。在括号内部，对象的属性以名称和值对的形式 (name : value) 来定义。属性由逗号分隔：
var person={firstname:"John", lastname:"Doe", id:5566};
上面例子中的对象 (person) 有三个属性：firstname、lastname 以及 id。
空格和折行无关紧要。声明可横跨多行：
var person={
firstname : "John",
lastname  : "Doe",
id        :  5566
};
对象属性有两种寻址方式：
实例
name=person.lastname;
name=person["lastname"];

8.
Undefined 和 Null
Undefined 这个值表示变量不含有值。
可以通过将变量的值设置为 null 来清空变量。
实例
cars=null;
person=null;
9．
JavaScript 变量均为对象。当您声明一个变量时，就创建了一个新的对象。

最常用的对象创建方式:
第一种：
function Demo(){
    var obj=new Object();
    obj.name="张思";
    obj.age=12;
    obj.firstF=function(){
    }
    obj.secondF=function(){
    }
    return obj;
}

var one=Demo();
// 调用输出
document.write(one.age);
第二种：
function Demo(){
    this.name="张思";
    this.age=12;
    this.firstF=function(){
    }
    this.secondF=function(){
    }
}

var one=new Demo

// 调用输出
document.write(one.age);

对象的创建，一般推荐使用
var perple = {name : 'Tom', age : 21 , eat : function(){  }    }
也可先创建对象再追加属性和方法
var people = new Ojbect();
people.name = 'Tom';   
people.age = 21;  
people.eat = function(){  }

9.

JavaScript 对象是变量的容器

JavaScript 对象是属性变量的容器。

对象方法
对象的方法定义了一个函数，并作为对象的属性存储。
对象方法通过添加 () 调用 (作为一个函数)。
该实例访问了 person 对象的 fullName() 方法:
实例
name = person.fullName();

你要访问 person 对象的 fullName 属性，它将作为一个定义函数的字符串返回：
name = person.fullName;


JavaScript 对象是属性和方法的容器。

10.
JavaScript 对大小写敏感。关键词 function 必须是小写的，并且必须以与函数名称相同的大小写来调用函数。
在您仅仅希望退出函数时 ，也可使用 return 语句。返回值是可选的：
function myFunction(a,b) { if (a>b) { return; } x=a+b }
11.
JavaScript 变量的生存期
JavaScript 变量的生命期从它们被声明的时间开始。
局部变量会在函数运行以后被删除。
全局变量会在页面关闭后被删除。
12.
向未声明的 JavaScript 变量分配值
如果您把值赋给尚未声明的变量，该变量将被自动作为全局变量声明。
这条语句：
carname="Volvo";
将声明一个全局变量 carname，即使它在函数内执行。

13.
JavaScript 作用域
在 JavaScript 中, 对象和函数同样也是变量。
在 JavaScript 中， 作用域为可访问变量，对象，函数的集合。
JavaScript 函数作用域: 作用域在函数内修改。
14.
在 HTML 中, 全局变量是 window 对象: 所有数据变量都属于 window 对象。
你的全局变量，或者函数，可以覆盖 window 对象的变量或者函数。
局部变量，包括 window 对象可以覆盖全局变量和函数

当用户改变input输入框内容时执行一段Javascript代码：
<input type="text" onchange="myFunction()">
onchange 事件会在域的内容改变时发生。
onchange 事件也可用于单选框与复选框改变后触发的事件。

15.
你也可以在字符串添加转义字符来使用引号：
实例
var x = 'It\'s alright';
var y = "He is called \"Johnny\"";

16.
不要创建 String 对象。它会拖慢执行速度，并可能产生其他副作用：
var x = "John";              
var y = new String("John");
(x === y) // 结果为 false，因为 x 是字符串，y 是对象
=== 为绝对相等，即数据类型与值都必须相等。
17.
原始值字符串，如 "John", 没有属性和方法(因为他们不是对象)。
原始值可以使用 JavaScript 的属性和方法，因为 JavaScript 在执行方法和属性时可以把原始值当作对象。
18.
var result1=5+5+"abc"; //结果将是"10abc"

var result2= ""+5+5+"abc"; //结果将是"55abc"

19.
href="#"与href="javascript:void(0)"的区别
# 包含了一个位置信息，默认的锚是#top 也就是网页的上端。
而javascript:void(0), 仅仅表示一个死链接。
在页面很长的时候会使用 # 来定位页面的具体位置，格式为：# + id。
如果你要定义一个死链接请使用 javascript:void(0) 。

javascript:void(0) 中最关键的是 void 关键字， void 是 JavaScript 中非常重要的关键字，该操作符指定要计算一个表达式但是不返回值。

void()仅仅是代表不返回任何值，但是括号内的表达式还是要运行
20.

12.7
1.
在常规的比较中，数据类型是被忽略的，以下 if 条件语句返回 true：
var x = 10;
var y = "10";
if (x == y)

2.
________________________________________
浮点型数据使用注意事项
JavaScript 中的所有数据都是以 64 位浮点型数据(float) 来存储。
所有的编程语言，包括 JavaScript，对浮点型数据的精确度都很难确定：
var x = 0.1;
var y = 0.2;
var z = x + y            // z 的结果为 0.3
if (z == 0.3)            // 返回 false

尝试一下 »
为解决以上问题，可以用整数的乘除法来解决：
实例
var z = (x * 10 + y * 10) / 10;       // z 的结果为 0.3
3.
JavaScript 字符串分行
JavaScript 允许我们在字符串中使用断行语句:
实例 1
var x =
"Hello World!";

尝试一下 »
但是，在字符串中直接使用回车换行是会报错的：
实例 2
var x = "Hello
World!";
字符串断行需要使用反斜杠(\)，如下所示:
实例 3
var x = "Hello \
World!";

尝试一下 »
4.
Return 语句使用注意事项
JavaScript 默认是在代码的最后一行自动结束。
在 JavaScript 中，分号是可选的 。

定义数组元素，最后不能添加逗号
错误的定义方式：
points = [40, 100, 1, 5, 25, 10,];
正确的定义方式：
points = [40, 100, 1, 5, 25, 10];
5.
定义对象，最后不能添加逗号
错误的定义方式：
websites = {site:"菜鸟教程", url:"www.runoob.com", like:460,}
正确的定义方式：
websites = {site:"菜鸟教程", url:"www.runoob.com", like:460}
________________________________________
Undefined 不是 Null
在 JavaScript 中, null 用于对象, undefined 用于变量，属性和方法。
对象只有被定义才有可能为 null，否则为 undefined。
如果我们想测试对象是否存在，在对象还没定义时将会抛出一个错误。
错误的使用方式：
if (myObj !== null && typeof myObj !== "undefined") 
正确的方式是我们需要先使用 typeof 来检测对象是否已定义：
if (typeof myObj !== "undefined" && myObj !== null) 
6.
程序块作用域
在每个代码块中 JavaScript 不会创建一个新的作用域，一般各个代码块的作用域都是全局的。
以下代码的的变量 i 返回 10，而不是 undefined：
实例
for (var i = 0; i < 10; i++) {
    // some code
}
return i;

变量在函数内声明，变量为局部作用域。
局部变量：只能在函数内部访问。

7.
JavaScript 内嵌函数
所有函数都能访问全局变量。  
实际上，在 JavaScript 中，所有函数都能访问它们上一层的作用域。
JavaScript 支持嵌套函数。嵌套函数可以访问上一层的函数变量。
该实例中，内嵌函数 plus() 可以访问父函数的 counter 变量：
实例
function add() { var counter = 0; function plus() {counter += 1;} plus(); return counter; }
8.
因为很多网站是共用一个IP地址的（虚拟主机），你单单输入一个IP地址电脑就不知道你要去哪。自然无法访问。我们host里google的IP就是这样的。
9.
sleep方法没有释放锁，而wait方法释放了锁，使得其他线程可以使用同步控制块或者方法。

12.8
1.
在连接mysql数据库时，用到的url中一般会添加"useUnicode=true&characterEncoding=UTF-8",而添加这段话的作用是：指定字符的编码、解码格式。
比如：若mysql数据库用到 是GBK编码方式，而项目数据库用的是UTF-8编码方式。这时如果添加了"useUnicode=true&characterEncoding=UTF-8"，则在存取数据时根据mysql和项目的编码方式将数据进行相应的格式转化。即：
1、存数据
数据库在存放项目数据的时候会先用UTF-8格式将数据解码成字节码，然后再将解码后的字节码重新使用GBK编码，并存放到数据库中。
2、取数据
在数据库中取数据的时候，数据库会先将数据库中的数据按GBK格式解码成字节码，然后再将解码后的字节码重新按UTF-8格式编码数据，最后再将数据返回给客户端。


2.
什么是Native Method
   简单地讲，一个Native Method就是一个java调用非java代码的接口。一个Native Method是这样一个java的方法：该方法的实现由非java语言实现，比如C。这个特征并非java所特有，很多其它的编程语言都有这一机制，比如在C＋＋中，你可以用extern "C"告知C＋＋编译器去调用一个C的函数。
   "A native method is a Java method whose implementation is provided by non-java code."
3.
java中的域
　　　　所谓的域，翻译成英文就是field， 也就是我们常说的字段，或者说是属性。 比如类的字段（属性），局部的，全局的。所谓域，其实是“field”的翻译
然后实例域，就是 实例("object" )的"field"。包括实例域和静态域，静态域又叫类域。
　　　　java中对象中的数据称为实例域（instance field）。
https://www.cnblogs.com/jerry007/archive/2013/01/18/java%E4%B8%AD%E5%9F%9F.html
4.
JIT编译器，英文写作Just-In-Time Compiler，中文意思是即时编译器。
JIT是一种提高程序运行效率的方法。通常，程序有两种运行方式：静态编译与动态解释。静态编译的程序在执行前全部被翻译为机器码，而解释执行的则是一句一句边运行边翻译
12.11
1.
命名空间的语法如下：
   xmlns:[prefix]=”[url of name]”
其中“xmlns:”是必须的属性。“prefix”是命名空间的别名，它的值不能为xml。

xsi:schemaLocation属性的值由一个URI引用对组成，两个URI之间以空白符分隔。第一个URI是名称空间的名字，第二个URI给出模式文档的位置，模式处理器将从这个位置读取模式文档，该模式文档的目标名称空间必须与第一个URI相匹配。我们看例4-28。
例4-28  book6.xml
 
<?xml version="1.0" encoding="GB2312"?>
<book xmlns="http://www.sunxin.org/book"   ①
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  ②
xsi:schemaLocation="http://www.sunxin.org/book http://www.sunxin.org/ 
book.xsd">  ③
<title>《Struts 2深入详解》</title>
<author>孙鑫</author>
</book>
① 声明默认的名称空间（http://www.sunxin.org/book）。
② 声明XML Schema实例名称空间（http://www.w3.org/2001/XMLSchema-instance），并将xsi前缀与该名称空间绑定，这样模式处理器就可以识别xsi:schemaLocation属性。XML Schema实例名称空间的前缀通常使用xsi。
③ 使用xsi:schemaLocation属性指定名称空间http://www.sunxin.org/book和模式位置http://www.sunxin.org/book.xsd相关。要注意，在这个例子中，book.xsd中声明的目标名称空间要求是http://www.sunxin.org/book。

2.
设置 Java 类路径
有三种方式设置 Java 类路径：
1．永久地，通过在系统级上设置 CLASSPATH 环境变量来实现。
使用控制面板的系统设置来添加名为 CLASSPATH 的新变量，从而永久性地设置 Windows 环境变量。
UNIX 用户可以通过向 .profile 或 .cshrc 文件添加 CLASSPATH 变量来永久设置类路径。

3.
<props>元素 
<props>创建了一个注入的java.util.Properties元素。例如每个人都有身高、体重等基本信息 

Java代码   
1.	1 import java.util.Properties;  
2.	2   
3.	3 public class Person {  
4.	4     private Properties basicInfo;  
5.	5   
6.	6     public void setBasicInfo(Properties basicInfo) {  
7.	7         this.basicInfo = basicInfo;  
8.	8      }  
9.	9 }  


配置方式： 
Java代码   
1.	1 <bean id="person" class="Person">  
2.	2         <property name="basicInfo">  
3.	3             <props>  
4.	4                 <!-- 身高 -->  
5.	5                 <prop key="stature">1.75</prop>  
6.	6                 <!-- 体重 -->  
7.	7                 <prop key="avoirdupois">120</prop>  
8.	8             </props>  
9.	9         </property>  
10.	10     </bean> 
4．
关于在spring  容器初始化 bean 和销毁前所做的操作定义方式有三种：
第一种：通过@PostConstruct 和 @PreDestroy 方法 实现初始化和销毁bean之前进行的操作
第二种是：通过 在xml中定义init-method 和  destory-method方法
第三种是： 通过bean实现InitializingBean和 DisposableBean接口
5.
BootStrap,ExtClassLoader,AppClassLoader
类加载器也是Java类，因为Java类的类加载器本身也是要被类加载器加载的，显然必须有第一个类加载器不是Java类，这个正是BootStrap,使用C/C++代码写的，已经封装到JVM内核中了，而ExtClassLoader和AppClassLoader是Java类。
5.
BootStrap：老大。类加载器的祖先。 打印它会得到null。
自己加的：
Object.class.getClassLoader()为何为null的解释，原来rt.jar的类加载器是Bootstrap，非java类。
负责加载JRE/lib/rt.jar(JDK中绝大部分的类)
12.12
1.
面向服务的架构（SOA）
Service-Oriented Architecture是一个组件模型，它将应用程序的不同功能单元（称为服务）通过这些服务之间定义良好的接口和契约联系起来。
2.
分布式协调技术 主要用来解决分布式环境当中多个进程之间的同步控制，让他们有序的去访问某种临界资源，防止造成"脏数据"的后果。
 
3.
“越狱”指的是绕过苹果在其设备上对操作系统施加的很多限制，从而可以“Root访问”基础的操作系统。简单来说，“越狱”可以让iPhone用户从苹果应用商店外下载其他非官方的应用程序，或者对用户界面进行定制。
4.
中间件
中间件就是程序中可植入的，可重用的，与业务逻辑无关的各种组件
中间件是基础软件的一大类，属于可复用软件的范畴。顾名思义，中间件处于操作系统软件与用户的应用软件的中间。中间件在操作系统、网络和数据库之上，应用软件的下层，总的作用是为处于自己上层的应用软件提供运行与开发的环境，帮助用户灵活、高效的开发和集成复杂的应用软件
中间件是一种独立的系统软件或服务程序，分布式应用软件借助这种软件在不同的技术之间共享资源，中间件位于客户机服务器的操作系统之上，管理计算资源和网络通信。
举例：
RMI（Remote Method Invocation）远程调用
Load Balancing 负载均衡，将访问符合分散到各个服务器中
Treasparent Fail-over 透明的故障切换
Clustering 集群，用多个小的服务器代替大型机
Back-end-Integration 后端集成，用现有的、新开发的系统如何去集成遗留的系统
Transaction 事务（全局事务：分布式事务）（局部事务：在同一数据库连接内的事务）
Dynamic Redeployment 动态重新部署，在不停止原系统的情况下，部署新的系统
System Managerment 系统管理
Threading 多线程处理
Message-oriented Middleware 面向消息的中间件（异步的调用编程）
Component Life Cycle 组件的生命周期管理
Resource pooling 资源池
Security 安全
Caching 缓存
5.
REST -- REpresentational State Transfer 直接翻译：表现层状态转移
URL定位资源，用HTTP动词（GET,POST,DELETE,DETC）描述操作。

5.1
REST描述的是在网络中client和server的一种交互形式；REST本身不实用，实用的是如何设计 RESTful API（REST风格的网络接口）；
5.2
Server提供的RESTful API中，URL中只使用名词来指定资源，原则上不使用动词。“资源”是REST架构或者说整个网络处理的核心。比如：
http://api.qc.com/v1/newsfeed: 获取某人的新鲜; 
http://api.qc.com/v1/friends: 获取某人的好友列表;
http://api.qc.com/v1/profile: 获取某人的详细信息;3. 用HTTP协议里的动词来实现资源的添加，修改，删除等操作。即通过HTTP动词来实现资源的状态扭转：
GET 用来获取资源，
POST 用来新建资源（也可以用于更新资源），
PUT 用来更新资源，
DELETE 用来删除资源。比如：
DELETE http://api.qc.com/v1/friends: 删除某人的好友 （在http parameter指定好友id）
POST http://api.qc.com/v1/friends: 添加好友
UPDATE http://api.qc.com/v1/profile: 更新个人资料


6.
REST -- REpresentational State Transfer
首先，之所以晦涩是因为前面主语被去掉了，全称是 Resource Representational State Transfer：通俗来讲就是：资源在网络中以某种表现形式进行状态转移。分解开来：
Resource：资源，即数据（前面说过网络的核心）。比如 newsfeed，friends等；
Representational：某种表现形式，比如用JSON，XML，JPEG等；
State Transfer：状态变化。通过HTTP动词实现。
7．
Dubbo 是阿里巴巴公司开源的一个Java高性能优秀的服务框架，使得应用可通过高性能的 RPC 实现服务的输出和输入功能，可以和 Spring框架无缝集成。

12.13
1.
在基于spring框架做项目开发时，写junit单元测试需要在spring的环境下运行测试用例，需要加载spring的配置环境信息，之前我们可以使用编码的方式来实现spring的环境启动，现在介绍下如何使用注解的方式，简单方便的使junit和spring进行整合测试
https://jingyan.baidu.com/article/a3761b2bfac0701577f9aa10.html
2.
在使用Spring进行自动注入的过程中，只会对通过读取Spring的配置文件或者配置类后产生的实例进行自动注入。 
手动new出来的实例是无法获得在Spring中注册过得实例，这是 因为手动new 的实例并不是Spring 在初始化过程中注册的实例。 

Spring默认都是单例的，new出来的对象，Spring依然不会对它进行装配，只有通过Spring创建的对象才会获得自动装配的功能
3.
ARP攻击就是通过伪造IP地址和MAC地址实现ARP欺骗，能够在网络中产生大量的ARP通信量使网络阻塞，攻击者只要持续不断的发出伪造的ARP响应包就能更改目标主机ARP缓存中的IP-MAC条目，造成网络中断或中间人攻击。
ARP攻击主要是存在于局域网网络中，局域网中若有一台计算机感染ARP木马，则感染该ARP木马的系统将会试图通过“ARP欺骗”手段截获所在网络内其它计算机的通信信息，并因此造成网内其它计算机的通信故障。
攻击者向电脑A发送一个伪造的ARP响应，告诉电脑A：电脑B的IP地址192.168.0.2对应的MAC地址是00-aa-00-62-c6-03，电脑A信以为真，将这个对应关系写入自己的ARP缓存表中，以后发送数据时，将本应该发往电脑B的数据发送给了攻击者。同样的，攻击者向电脑B也发送一个伪造的ARP响应，告诉电脑B：电脑A的IP地址192.168.0.1对应的MAC地址是00-aa-00-62-c6-03，电脑B也会将数据发送给攻击者。
至此攻击者就控制了电脑A和电脑B之间的流量，他可以选择被动地监测流量，获取密码和其他涉密信息，也可以伪造数据，改变电脑A和电脑B之间的通信内容。
为了解决ARP攻击问题，可以在网络中的交换机上配置802.1x协议。
IEEE 802.1x是基于端口的访问控制协议，它对连接到交换机的用户进行认证和授权。在交换机上配置802.1x协议后，攻击者在连接交换机时需要进行身份认证（结合MAC、端口、帐户、VLAN和密码等），只有通过认证后才能向网络发送数据。攻击者未通过认证就不能向网络发送伪造的ARP报文。
4.
Dump文件是进程的内存镜像。可以把程序的执行状态通过调试器保存到dump文件中。Dump文件是用来给驱动程序编写人员调试驱动程序用的，这种文件必须用专用工具软件打开，比如使用WinDbg打开。
5.
OOM  out of  memory
原语 操作系统或计算机网络用语范畴。是由若干条指令组成的，用于完成一定功能的一个过程。
6.
栈深度
 相当于递归调用的次数一样
7.
常说的GC(Garbage Collector) roots，特指的是垃圾收集器（Garbage Collector）的对象，GC会收集那些不是GC roots且没有被GC roots引用的对象。
8.
java.lang.OutOfMemory错误，此错误来自JVM，不是Throwable的，无法用try…catch捕捉
9.
public String intern()
返回字符串对象的规范化表示形式。 
一个初始为空的字符串池，它由类 String 私有地维护。 
当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（用 equals(Object) 方法确定），则返回池中的字符串。否则，将此 String 对象添加到池中，并返回此 String 对象的引用。 
它遵循以下规则：对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。 
10.
LifecyclePhaseNotFoundException，Unknown lifecycle phase "mvn". You must specify a valid lifecycle

•	原因1：
使用Eclipse Maven插件[Run As]-[Maven build]时并未为其指定goal或phase 
解决方法： 
在pom.xml中找到 <build> 节点，在里面加上<defaultGoal>compile</defaultGoal>即可
•	原因2： 
使用Eclipse Maven插件[Run As]-[Maven build]时多输入了mvn命令 
，因为Eclipse Maven插件已经帮你加上了mvn的命令前缀，再手动输出mvn clean install之类的 命令就会变成mvn mvn clean install


