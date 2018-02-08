# 项目介绍

android 最小工程

```


├── README.md                                                   项目说明文档
├── app                                         
│   ├── app.iml                                                 .iml文件. ide生成, 加入.gitignore忽略
│   ├── build.gradle                                            配置文件, 版本号, 包名统一在这个地方, 参照这个模版
│   ├── libs                                                    jar, so, aar包放置文件夹
│   ├── proguard-rules.pro                                      混淆配置文件, 暂时不用
│   └── src                                                     代码, 及其他
│       └── main            
│           ├── AndroidManifest.xml                             android清单文件
│           ├── assets                                          游戏，及其他资源文件, u3d, cocos资源放的地方
│           ├── java                                            java代码
│           │   └── com                             
│           │       └── byhy            
│           │           └── sdk                 
│           │               ├── App.java                        继承Application，应用生命周期开始
│           │               ├── MainActivity.java               cocos, u3d的activity
│           │               └── SplashActivity.java             开屏activity
│           └── res                                             资源文件
│               ├── drawable                                    图片资源
│               │   └── splash_1.png                            开屏图片, 绑定SplashActivity
│               ├── layout                                      布局, view
│               │   ├── activity_main.xml       
│               │   └── activity_splash.xml         
│               ├── mipmap-hdpi                                 icon, 名字固定, quick渠道的放在drawable下(旧的标准)
│               │   └── ic_launcher.png             
│               ├── mipmap-mdpi         
│               │   └── ic_launcher.png         
│               ├── mipmap-xhdpi                                目前只需要一个512*512尺寸的icon
│               │   └── ic_launcher.png             
│               ├── mipmap-xxhdpi           
│               │   └── ic_launcher.png     
│               ├── mipmap-xxxhdpi          
│               │   └── ic_launcher.png                   
│               └── values                                      资源参数   
│                   ├── colors.xml                  
│                   ├── strings.xml                             游戏名字, gamekey, app_id统一记录在这
│                   └── styles.xml      
├── build.gradle                                                配置签名, 需要的库, 参照这个模版
├── gradle                                                      gradle配置版本
│   └── wrapper     
│       ├── gradle-wrapper.jar  
│       └── gradle-wrapper.properties   
├── gradle.properties                                           配置文件, 配置打包速度等
├── gradlew                                                     gradlew命令相关
├── gradlew.bat                                                 gradlew命令相关
├── intro.iml           
├── local.properties                                            ide生成的sdk, ndk的路径,每个人都不一样    
├── uc10d.jks                                                   签名文件
└── settings.gradle                                             setting 包含项目, sdk通过这种方式引用        

```

## 项目拆分

* src下的文件属于android相关
* 其余的gradle等, 用来帮助安装打包, 引用资源等
 
## 相关命令行

* ndk-build打包so
* gradle assembleDebug, gradle assembleRelease打包
