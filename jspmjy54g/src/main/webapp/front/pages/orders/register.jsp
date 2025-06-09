<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>注册</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script>
    addEventListener("load", function () {
      setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
      window.scrollTo(0, 1);
    }
  </script>
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <link rel="stylesheet" href="../../xznstatic/css/style.css" type="text/css" media="all">
  <link href="../../xznstatic/css/font-awesome.min.css" rel="stylesheet">

</head>
<body>
  <div id="mian" class="main-bg">
    <h1 v-text="projectName"></h1>
    <div class="sub-main-w3">
      <div class="image-style"></div>
      <div class="vertical-tab">
        <div id="section1" class="section-w3ls">
          <input type="radio" name="sections" id="option1" checked="checked">
            <article>
			        <form class="layui-form login-form">
                <div class="layui-form-item layui-form-text input">
                  <div class="layui-input-inline" style="width: 300px;">
                    <input type="text" id="tablename" name="tablename" placeholder="请输入商品表名" autocomplete="off" class="layui-input">
                  </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                  <div class="layui-input-inline" style="width: 300px;">
                    <input type="text" id="goodid" name="goodid" placeholder="请输入商品id" autocomplete="off" class="layui-input">
                  </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                  <div class="layui-input-inline" style="width: 300px;">
                    <input type="text" id="goodname" name="goodname" placeholder="请输入商品名称" autocomplete="off" class="layui-input">
                  </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                  <div class="layui-input-inline" style="width: 300px;">
                    <input type="text" id="buynumber" name="buynumber" placeholder="请输入购买数量" autocomplete="off" class="layui-input">
                  </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                  <div class="layui-input-inline" style="width: 300px;">
                    <input type="text" id="price" name="price" placeholder="请输入价格/积分" autocomplete="off" class="layui-input">
                  </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                  <div class="layui-input-inline" style="width: 300px;">
                    <input type="text" id="discountprice" name="discountprice" placeholder="请输入折扣价格" autocomplete="off" class="layui-input">
                  </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                  <div class="layui-input-inline" style="width: 300px;">
                    <input type="text" id="total" name="total" placeholder="请输入总价格/总积分" autocomplete="off" class="layui-input">
                  </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                  <div class="layui-input-inline" style="width: 300px;">
                    <input type="text" id="discounttotal" name="discounttotal" placeholder="请输入折扣总价格" autocomplete="off" class="layui-input">
                  </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                  <div class="layui-input-inline" style="width: 300px;">
                    <input type="text" id="address" name="address" placeholder="请输入地址" autocomplete="off" class="layui-input">
                  </div>
                </div>
                <div class="layui-form-item" style="margin-bottom: 0;">
                  <div class="layui-input-block" style="margin-left: 0;">
                    <button class="layui-btn btn-submit btn submit" style="height: 50px;line-height: 25px;" lay-submit lay-filter="register">注册</button>
                  </div>
                </div>
                <a class="bottom-text-w3ls" href="javascript:window.location.href='../login/login.jsp'">已有账号？去登录</a>
              </form>
            </article>
          </div>
        </div>
        <div class="clear"></div>
      </div>
      <div class="copyright">
        <h2><a href="#"></a></h2>
      </div>
    </div>

  <script src="../../layui/layui.js"></script>
  <script src="../../js/vue.js"></script>
  <!-- 组件配置信息 -->
  <script src="../../js/config.js"></script>
  <!-- 扩展插件配置信息 -->
  <script src="../../modules/config.js"></script>
  <!-- 工具方法 -->
  <script src="../../js/utils.js"></script>
  <!-- 校验格式工具类 -->
  <script src="../../js/validate.js"></script>

  <script>
    var vue = new Vue({
      el: '#mian',
      data: {
        projectName: projectName
      }
    });

    layui.use(['layer', 'element', 'carousel', 'form', 'http', 'jquery'], function() {
      var layer = layui.layer;
      var element = layui.element;
      var carousel = layui.carousel;
      var form = layui.form;
      var http = layui.http;
      var jquery = layui.jquery;

      var tablename = http.getParam('tablename');
              
      // 注册
      form.on('submit(register)', function(data) {
        data = data.field;
        if(!data.orderid){
          layer.msg('订单编号不能为空', {
            time: 2000,
            icon: 5
          });
          return false
        }
                                        if(!data.userid){
          layer.msg('用户id不能为空', {
            time: 2000,
            icon: 5
          });
          return false
        }
                        if(!data.goodid){
          layer.msg('商品id不能为空', {
            time: 2000,
            icon: 5
          });
          return false
        }
                                                        if(!data.buynumber){
          layer.msg('购买数量不能为空', {
            time: 2000,
            icon: 5
          });
          return false
        }
        if(!isIntNumer(data.buynumber)){
          layer.msg('购买数量应输入整数', {
            time: 2000,
            icon: 5
          });
          return false
        }
                        if(!data.price){
          layer.msg('价格/积分不能为空', {
            time: 2000,
            icon: 5
          });
          return false
        }
        if(!isNumber(data.price)){
          layer.msg('价格/积分应输入数字', {
            time: 2000,
            icon: 5
          });
          return false
        }
                        if(!isNumber(data.discountprice)){
          layer.msg('折扣价格应输入数字', {
            time: 2000,
            icon: 5
          });
          return false
        }
                        if(!data.total){
          layer.msg('总价格/总积分不能为空', {
            time: 2000,
            icon: 5
          });
          return false
        }
        if(!isNumber(data.total)){
          layer.msg('总价格/总积分应输入数字', {
            time: 2000,
            icon: 5
          });
          return false
        }
                        if(!isNumber(data.discounttotal)){
          layer.msg('折扣总价格应输入数字', {
            time: 2000,
            icon: 5
          });
          return false
        }
                        if(!isIntNumer(data.type)){
          layer.msg('支付类型应输入整数', {
            time: 2000,
            icon: 5
          });
          return false
        }
                                                        http.requestJson(tablename + '/register', 'post', data, function(res) {
          layer.msg('注册成功', {
            time: 2000,
            icon: 6
          },function(){
            // 路径访问设置
            window.location.href = '../login/login.jsp';
          });
        });
        return false
      });
    });
  </script>
</body>
</html>
