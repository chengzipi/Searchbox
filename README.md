# Searchbox
android搜索框，推荐搜索，历史搜索


![image](https://github.com/chengzipi/exampleTools/raw/master/images-folder/searchbox.png "运行页面")



# 使用方法
### Add it in your root build.gradle at the end of repositories:
    allprojects {
      repositories {
      ...
      maven { url "https://jitpack.io" }
      }
    }
  
### Add the dependency
    dependencies {
        compile 'com.github.chengzipi:Searchbox:v1.0.0'
    }
    
    
### 举例说明  xml

```
<com.czp.searchmlist.mSearchLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/msearchlayout"
    app:search_hint="美食快搜"
    app:search_baground="@drawable/search_baground_shap"
/>
```
        
#### 属性方法 
    app:search_hint hint内容
    app:search_baground 搜索框背景
    
## Code
        //历史搜索数据
        String shareData = "澳洲美食,长沙美食,韩国料理,日本料理,舌尖上的中国,意大利餐,山西菜";
        List skills = Arrays.asList(shareData.split(","));
        
        //热门搜索数据
        String shareHotData = "粤菜,浙菜,苏菜";
        List skillHots = Arrays.asList(shareHotData.split(","));
        
        this.msearchLy.initData(skills, skillHots, new setSearchCallBackListener() {
            public void Search(String str) {
              //进行或联网搜索  str搜索关键词
            }

            public void Back() {
                //取消搜索
                demo.this.finish();
            }

            public void ClearOldData() {
              //清除历史搜索记录  执行更新本地 原始历史搜索数据
            }

            public void SaveOldData(ArrayList<String> AlloldDataList) {
                //保存所有历史搜索数据  请保保存以便下次使用
            }
        });
