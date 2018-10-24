天气版本库的Git地址：
https://github.com/SunshineHYX/Weather.git

罗列中国所有省份网址：http://guolin.tech/api/china



cd ../../../f/android/Weather

https://github.com 
该网址是GitHub全球最大的代码托管网站，借助Git来进行版本控制

db包 存放数据库模型相关代码
gson包 存放GSON模型相关代码
service包 存放服务相关代码
util包 存放工具相关代码

第一阶段：创建好数据库和表
    
    目的：从服务器中获取到的数据才能够存储到本地
    
    即：创建省市县的三个实体类，并将这三个类添加到映射列表中，并在AndroidManifest.xml中配置LitePalApplication

第二阶段：遍历全国省市县数据

    目的：全国省市县的数据都是从服务器端获得，即需要和服务器进行交互

    1.在Util包下创建HttpUtil类，与服务器进行交互
    2.在util包下创建Utility类，解析和处理服务器返回的省市县的数据：
        使用JSONArray和JSONObject将数据解析出来，组装成实体类对象，调用save()方法将数据存储到数据库当中，因JSON数据结构简单，不用使用GSON进行解析
    3.写界面(因省市县的功能后面复用，即不写在活动里，写在碎片里，复用时直接在布局中引用碎片)
        res/layout目录中新建choose_area.xml布局
        
    4.编写用于遍历省市县数据的碎片
        新建ChooseAreaFragment继承自Fragment，onCreateView()方法中
    获取控件实例，初始化ArrayAdapter，并将其设置为ListView的适配工作完成OnActivityCreated()方法中给ListView和Button设置点击事件，则初始化完成
        因碎片不能直接显示在界面上，需将它添到活动里，即需要修改activity_main.xml中的代码。
        因碎片中自定义标题栏，不需原生ActionBar，即修改res/values/styles.xml中代码
        在AndroidManifest.xml中声明访问网络的权限

第三阶段：显示天气信息
   
    查询天气信息，并显示出来。因和风天气返回的JSON数据结构复杂，用JSONObject解析很麻烦，即此处用GSON对天气信息进行解析
    
    1.定义GSON实体类：
        在gson包中，创建6个实体类对象，分解和风天气返回的数据













    
    