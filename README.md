# [AndroidAnimationSample](https://github.com/ronghao/AndroidAnimationSample)  [![GitHub license](https://img.shields.io/badge/license-Apache%202-blue.svg)](https://raw.githubusercontent.com/ronghao/CacheManage/master/LICENSE)

> android 三种实现动画的示例 

# 原理
- View Animation
  - 补间动画Tween Animation :旋转、渐变、移动、缩放,使用Matrix的计算中间路径的效果
  - 逐帧动画Frame Animation[Drawable Animation]：顺序播放事先做好的图像，是一种画面转换动画
- Property Animation 属性动画
  - 单个绘制过程【animateValue（）】为：计算出当前进度（(currentTime - mStartTime) / mDuration），将所得值交给插值器计算得出新的进度值，evaluator（估值算法）根据新的进度值计算出当前进度的属性动画的值，通过反射机制进行设置
  - 判断是否完成，重复单个绘制过程

# 关于
+ 个人博客：[www.haohaohu.com](http://www.haohaohu.com/)
+ 如果你也喜欢这个库，Star一下吧，欢迎Fork