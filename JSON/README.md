## JSON

1. JSON数据和JAVA对象的相互转换
  * **JSON解析器：**
    * 常见的解析器：Jsonlib, Gson, fastjson, jackson

  1. JSON转为Java对象   
    <1>. 导入jackson的相关jar包   
    <2>. 创建Jackson核心对象 ObjectMapper   
    <3>. 调用ObjectMapper的相关方法进行转换  
      * readValue(json字符串数据，class)

  2. Java对象转换JSON     
    1. 使用步骤：   
      1. 导入jackson的相关jar包
      2. 创建Jackson核心对象 ObjectMapper
      3. 调用ObjectMapper的相关方法进行转换   
        <1>. 转换方法：
          * **writeValue(参数1, obj):**   
            * 参数1：   
              * File: 将obj对象转换为json字符串，并保存到指定的文件中  
   
              * Writer: 将obj对象转换为json字符串，并将json数据填充到字符输出流中  
   
              * OutputStream: 将obj对象转换为JSON字符串，并将json数据填充到字节输出流中   

          * **writeValueAsString(obj)：将对象转为json字符串**

          <2>. 注解：   
            * **@JsonIgnore: 排除属性**
            * **@JsonFormat: 属性值格式化**
            * **详细代码请看：studyJava\JSON\code\Jackson的使用**
          
          <3>. 复杂java对象转换
            * List: 数组
            * Map: 对象格式一致
            * 详细代码请看：studyJava\JSON\code\Jackson的使用

      4. 详细代码请看： studyJava\JSON\code\Jackson的使用
      