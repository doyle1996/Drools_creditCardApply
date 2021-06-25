信用卡申请：


#### 通过Drools规则引擎来根据规则进行申请人的合法性检查，检查通过后再根据规则确定信用卡额度，最终页面效果如下：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210625191959145.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0RveWxlXw==,size_16,color_FFFFFF,t_70)
**计算规则**:

合法性检查规则如下：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210625192207847.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0RveWxlXw==,size_16,color_FFFFFF,t_70)
信用卡额度确定规则：
![在这里插入图片描述](https://img-blog.csdnimg.cn/2021062519235666.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0RveWxlXw==,size_16,color_FFFFFF,t_70)
## 实现步骤：

第一步：创建maven工程creditCardApply并配置pom.xml文件

 第二步：创建/resources/application.yml文件

 第三步：编写配置类DroolsConfig

 第四步：编写实体类CreditCardApplyInfo

 第五步：在resources/rules下创建规则文件creditCardApply.drl文件

 第六步：创建RuleService

 第七步：创建RuleController

 第八步：创建启动类DroolsApplication

 第九步：导入静态资源文件到resources/static目录下
