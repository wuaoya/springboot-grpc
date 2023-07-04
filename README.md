# springboot-grpc
## 选型背景
使用grpc的protobuf比rest的json速度要快，目前在网计算项目需管理对接大量服务端和客户端，所以选用此方案。
## 项目介绍
该项目是采用国人开发的grpc-springboot-starter整合springboot2.x版本和grpc，由于springboot官方暂无对接grpc的starter，您也可以自行编写客户端和服务端。
## 如何使用
将项目demo拉取并加载好maven配置后，通过grpc-lib的protobuf插件compile进行编译，然后custom生成相关java类，可以看到client和server都引用了这个包，随后启动客户端和服务端就可以。
## 怎么开发
首先去了解protobuf语法，该传输介质的方法需要自己定义，然后complice和custom，之后便可以在双端使用插件基于protobuf生成的java方法，编写你的业务即可。
## 源码原理
待补充
## 常见问题
1，IDE识别protobuf需要去IDE插件去装。
2，该项目暂时没有编写异常处理。
3，项目中对象复杂属性拷贝存在问题，待开发完善。
4，其它问题issue上，敬请指点。
