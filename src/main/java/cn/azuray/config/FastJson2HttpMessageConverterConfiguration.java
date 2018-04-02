//package cn.azuray.config;
//
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.alibaba.fastjson.serializer.ValueFilter;
//import com.alibaba.fastjson.support.config.FastJsonConfig;
//import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//@ConditionalOnClass({FastJsonHttpMessageConverter.class})
//@ConditionalOnProperty(name = {"spring.http.converters.preferred-json-mapper"},havingValue = "fastjson",matchIfMissing = true)
//public class FastJson2HttpMessageConverterConfiguration {
//    protected FastJson2HttpMessageConverterConfiguration() {
//    }
//
//    @Bean
//    @ConditionalOnMissingBean({FastJsonHttpMessageConverter.class})//3
//    public FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
//        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();//4
//        fastJsonConfig.setSerializerFeatures(
//                SerializerFeature.PrettyFormat,
//                SerializerFeature.WriteClassName,
//                SerializerFeature.WriteMapNullValue
//        );
////        ValueFilter valueFilter = new ValueFilter() {//5
////            //o 是class
////            //s 是key值
////            //o1 是value值
////            public Object process(Object o, String s, Object o1) {
////                if (null == o1){
////                    o1 = "";
////                }
////                return o1;
////            }
////        };
//        //升级最新版本需加=============================================================
//        List<MediaType> supportedMediaTypes = new ArrayList<>();
//        supportedMediaTypes.add(MediaType.APPLICATION_JSON);
//        supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        supportedMediaTypes.add(MediaType.APPLICATION_ATOM_XML);
//        supportedMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
//        supportedMediaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
//        supportedMediaTypes.add(MediaType.APPLICATION_PDF);
//        supportedMediaTypes.add(MediaType.APPLICATION_RSS_XML);
//        supportedMediaTypes.add(MediaType.APPLICATION_XHTML_XML);
//        supportedMediaTypes.add(MediaType.APPLICATION_XML);
//        supportedMediaTypes.add(MediaType.IMAGE_GIF);
//        supportedMediaTypes.add(MediaType.IMAGE_JPEG);
//        supportedMediaTypes.add(MediaType.IMAGE_PNG);
//        supportedMediaTypes.add(MediaType.TEXT_EVENT_STREAM);
//        supportedMediaTypes.add(MediaType.TEXT_HTML);
//        supportedMediaTypes.add(MediaType.TEXT_MARKDOWN);
//        supportedMediaTypes.add(MediaType.TEXT_PLAIN);
//        supportedMediaTypes.add(MediaType.TEXT_XML);
//        converter.setSupportedMediaTypes(supportedMediaTypes);
////        fastJsonConfig.setSerializeFilters(valueFilter);
//        fastJsonConfig.setCharset(Charset.forName("utf-8"));
//        converter.setFastJsonConfig(fastJsonConfig);
//
//        return converter;
//    }
//}
