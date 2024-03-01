<template>
  <div class="login-container" id="building">
    <el-button type="primary" @click="dialogVisible = true" icon="el-icon-edit" circle ></el-button>
    <el-table
    :data="tableData.filter(data => !search || data.cohortTitle.toLowerCase().includes(search.toLowerCase()))"
    style="width: 100%">
    <el-table-column type="expand">
      <template slot-scope="props">
        <el-form label-position="left" inline class="demo-table-expand">
          <el-form-item label="Cohort Id">
            <span>{{ props.row.cohortId }}</span>
          </el-form-item>
          <el-form-item label="Cohort Title">
            <span>{{ props.row.cohortTitle }}</span>
          </el-form-item>
          <el-form-item label="Cohort Tag">
            <span>{{ props.row.cohortTags }}</span>
          </el-form-item>
          <el-form-item label="Cohort Source">
            <span>{{ props.row.cohortSource}}</span>
          </el-form-item>
          <el-form-item label="Cohort WebLink">
            <el-link type="primary" @click="jump2(props.row.cohortWebLink)">{{ props.row.cohortWebLink }}</el-link>
          </el-form-item>
          <el-form-item label="Cohort Funding">
            <span>{{ props.row.cohortFunding }}</span>
          </el-form-item>
          <el-form-item label="Cohort Key Publication">
            <span>{{ props.row.cohortKeyPublication }}</span>
          </el-form-item>
          <el-form-item label="Cohort Start year">
            <span>{{ props.row.cohortStartyear }}</span>
          </el-form-item>
          <el-form-item label="Cohort Recent year">
            <span>{{ props.row.cohortRecentyear}}</span>
          </el-form-item>
        </el-form>
      </template>
    </el-table-column>
    <el-table-column
      label="Cohort ID"
      prop="cohortId"
      width="100px" >
    </el-table-column>
    <el-table-column
      label="Cohort Title"
      prop="cohortTitle">
    </el-table-column>
    <el-table-column
      label="Cohort Tags"
      prop="cohortTags">
    </el-table-column>
     <el-table-column
      label="Cohort Participants"
      prop="cohortParticipants"
      width="180px"
      sortable>
    </el-table-column>
    <el-table-column
      label="Data"
      width="180px">
      <template slot-scope="props">
         <el-button
        prop="bt"
          size="mini"
          @click="handleEdit(props.row)">
          Data Visualization</el-button>
      </template>
    </el-table-column>
     <el-table-column
      align="right">
      <template slot="header" slot-scope="scope">
        <el-input
          v-model="search"
          size="mini"
          placeholder="Search by keywords"/>
      </template>
     </el-table-column>
  </el-table>
 <el-dialog title="PieCharts for Data" :visible.sync="dialogTableVisible"   @open="open()">
  <div class="dialogDiv">
  <div class="echart" id="mychart" :style="myChartStyle"></div>
  <div class="echart1" id="mychart1" :style="myChartStyle"></div>
   </div>
</el-dialog>
  <el-dialog
  title="提示"
  :visible.sync="dialogVisible"
  width="30%"
  :before-close="handleClose">
    <el-form ref="loginForm" :model="loginForm" :rules="loginRules" class="login-form" autocomplete="on" label-position="left">
      <div class="title-container">
        <h3 class="title">Login</h3>
      </div>
      <el-form-item prop="username">
        <span class="svg-container">
          <svg-icon icon-class="user" />
        </span>
        <el-input
          ref="username"
          v-model="loginForm.username"
          placeholder="Username"
          name="username"
          type="text"
          tabindex="1"
          autocomplete="on"
        />
      </el-form-item>
      <el-tooltip v-model="capsTooltip" content="Caps lock is On" placement="right" manual>
        <el-form-item prop="password">
          <span class="svg-container">
            <svg-icon icon-class="password" />
          </span>
          <el-input
            :key="passwordType"
            ref="password"
            v-model="loginForm.password"
            :type="passwordType"
            placeholder="Password"
            name="password"
            tabindex="2"
            autocomplete="on"
            @keyup.native="checkCapslock"
            @blur="capsTooltip = false"
            @keyup.enter.native="handleLogin"
          />
          <span class="show-pwd" @click="showPwd">
            <svg-icon :icon-class="passwordType === 'password' ? 'eye' : 'eye-open'" />
          </span>
        </el-form-item>
      </el-tooltip>
      <el-button :loading="loading" type="primary" style="width:100%;margin-bottom:30px;" @click.native.prevent="handleLogin">Login</el-button>
    </el-form>
  </el-dialog>
  </div>
</template>

<script>
import { validUsername } from '@/utils/validate'
import SocialSign from './components/SocialSignin'
import * as echarts from "echarts"
export default {
  name: 'login',
  components: { SocialSign },
  data() {
    const validateUsername = (rule, value, callback) => {
      if (!validUsername(value)) {
        callback(new Error('Please enter the correct user name'))
      } else {
        callback()
      }
    }
    const validatePassword = (rule, value, callback) => {
      if (value.length < 6) {
        callback(new Error('The password can not be less than 6 digits'))
      } else {
        callback()
      }
    }
    return {
      myChart: {},
        myChart1: {},
      pieData: [
        {
          value: '',
          name: 'Male'
        },
        {
          value: '',
          name: 'Female'
        }
      ],
        pieData1: [
        {
          value: '',
          name: 'under 20'
        },
        {
          value: '',
          name: '20~39'
        },
        {
          value: '',
          name: '40~59'
        },
        {
          value: '',
          name: 'over 60'
        }
      ],
       pieName: [],
       pieName9: [],
      myChartStyle: { float: "left", width: "100%", height: "400px" },
        dialogTableVisible: false,
        search: '',
       tableData: [{
          cohortId: '',
          cohortTitle: '',
          cohortTags: '',
          cohortContent: '',
          cohortWebLink: '',
          cohortFunding: '',
          cohortKeyPublication: '',
          cohortSource: '',
          cohortStartyear: '',
          cohortRecentyear: '',
          cohortParticipants: '',
          cohortMparticipants: '',
          cohort20: '',
          cohort2039: '',
          cohort4059: '',
          cohort60: '',
          }],
      dialogVisible: false,
      loginForm: {
        username: 'admin',
        password: '111111'
      },
      loginRules: {
        username: [{ required: true, trigger: 'blur', validator: validateUsername }],
        password: [{ required: true, trigger: 'blur', validator: validatePassword }]
      },
      passwordType: 'password',
      capsTooltip: false,
      loading: false,
      showDialog: false,
      redirect: undefined,
      otherQuery: {}
    }
  },
  watch: {
    $route: {
      handler: function(route) {
        const query = route.query
        if (query) {
          this.redirect = query.redirect
          this.otherQuery = this.getOtherQuery(query)
        }
      },
      immediate: true
    }
  },
  created(){
        this.$axios.get("http://localhost:8080/re/cohort/selectAllCohort").then(res => {
        console.log(res.data)
        this.tableData = res.data
      })
      },
  mounted() {
    if (this.loginForm.username === '') {
      this.$refs.username.focus()
    } else if (this.loginForm.password === '') {
      this.$refs.password.focus()
    }
    this.initDate(); 
    this.initEcharts();
    this.initData(); 
    this.initEcharts1();
  },
  destroyed() {
    // window.removeEventListener('storage', this.afterQRScan)
  },
  methods: {
            jump2(e){
        window.location.href=e
        },
         open(){
        this.$nextTick(() => {
        //  执行echarts方法
          this.initEcharts(),
          this.initEcharts1()
        })
      },
    initDate() {
      for (let i = 0; i < this.pieData.length; i++) {
        // this.xData[i] = i;
        // this.yData =this.xData[i]*this.xData[i];
        this.pieName[i] = this.pieData[i].name;
      }
      for (let a = 0; a < this.pieData1.length; a++) {
        // this.xData[i] = i;
        // this.yData =this.xData[i]*this.xData[i];
        this.pieName9[a] = this.pieData1[a].name;
      }
    },
    initData() {
      for (let a = 0; a < this.pieData1.length; a++) {
        // this.xData[i] = i;
        // this.yData =this.xData[i]*this.xData[i];
        this.pieName9[a] = this.pieData1[a].name;
      }
    },
    initEcharts() {
      // 饼图
      const option = {
        legend: {
          // 图例
          data: this.pieName,
          right: "10%",
          top: "30%",
          orient: "vertical"
        },
        title: {
          // 设置饼图标题，位置设为顶部居中
          text: "Compare by Gender",
          top: "0%",
          left: "center"
        },
        series: [
          {
            type: "pie",
            label: {
              show: true,
              formatter: "{b} : {c} ({d}%)" // b代表名称，c代表对应值，d代表百分比
            },
            radius: "30%", //饼图半径
            data: this.pieData
          }
        ]
      };
      console.log(this.seriesData);
      const optionFree = {
        xAxis: {},
        yAxis: {},
        series: [
          {
            data: this.seriesData,
            type: "line",
            smooth: true
          }
        ]
      };
      this.myChart = echarts.init(document.getElementById("mychart"));
      this.myChart.setOption(option);
      //随着屏幕大小调节图表
      window.addEventListener("resize", () => {
        this.myChart.resize();
      });
    },
     initEcharts1() {
      // 饼图
      const option1 = {
        legend: {
          data: this.pieName9,
          right: "10%",
          top: "30%",
          orient: "vertical"
        },
        title: {
          // 设置饼图标题，位置设为顶部居中
          text: "Compare by age",
          top: "0%",
          left: "center"
        },
        series: [
          {
            type: "pie",
            label: {
              show: true,
              formatter: "{b} : {c} ({d}%)" // b代表名称，c代表对应值，d代表百分比
            },
            radius: "30%", //饼图半径
            data: this.pieData1
          }
        ]
      };
      console.log(this.seriesData);
      const optionFree = {
        xAxis: {},
        yAxis: {},
        series: [
          {
            data: this.seriesData,
            type: "line",
            smooth: true
          }
        ]
      };
      this.myChart1 = echarts.init(document.getElementById("mychart1"));
      this.myChart1.setOption(option1);
      //随着屏幕大小调节图表
      window.addEventListener("resize", () => {
        this.myChart1.resize();
      });
    },
    handleEdit(e){
    this.dialogTableVisible=true
    this.$axios.get("http://localhost:8080/re/cohort/selectAllCohort").then(res => {
        if (e.cohortMparticipants!=''&& e.cohortFparticipants!=''){
        this.pieData[0].value= e.cohortMparticipants
        this.pieData[1].value= e.cohortFparticipants
        this.pieData1[0].value= e.cohort20
        this.pieData1[1].value= e.cohort2039
        this.pieData1[2].value= e.cohort4059
        this.pieData1[3].value= e.cohort60
        };
        console.log(this.pieName)
        //if(this.pieData.name=='female'){
       // this.pieData.value=e.cohortFparticipants
        //}
      })
    },
    checkCapslock(e) {
      const { key } = e
      this.capsTooltip = key && key.length === 1 && (key >= 'A' && key <= 'Z')
    },
    showPwd() {
      if (this.passwordType === 'password') {
        this.passwordType = ''
      } else {
        this.passwordType = 'password'
      }
      this.$nextTick(() => {
        this.$refs.password.focus()
      })
    },
    handleLogin() {
      this.$refs.loginForm.validate(valid => {
        if (valid) {
          this.loading = true
          this.$store.dispatch('user/login', this.loginForm)
            .then(() => {
              this.$router.push({ path: this.redirect || '/', query: this.otherQuery })
              this.loading = false
            })
            .catch(() => {
              this.loading = false
            })
        } else {
          console.log('error submit!!')
          return false
        }
      })
    },
    getOtherQuery(query) {
      return Object.keys(query).reduce((acc, cur) => {
        if (cur !== 'redirect') {
          acc[cur] = query[cur]
        }
        return acc
      }, {})
    }
    // afterQRScan() {
    //   if (e.key === 'x-admin-oauth-code') {
    //     const code = getQueryObject(e.newValue)
    //     const codeMap = {
    //       wechat: 'code',
    //       tencent: 'code'
    //     }
    //     const type = codeMap[this.auth_type]
    //     const codeName = code[type]
    //     if (codeName) {
    //       this.$store.dispatch('LoginByThirdparty', codeName).then(() => {
    //         this.$router.push({ path: this.redirect || '/' })
    //       })
    //     } else {
    //       alert('第三方登录失败')
    //     }
    //   }
    // }
  }
}
</script>

<style lang="scss">


$bg:#283443;
$light_gray:#fff;
$cursor: #fff;

@supports (-webkit-mask: none) and (not (cater-color: $cursor)) {
  .login-container .el-input input {
    color: $cursor;
  }
}

/* reset element-ui css */
.login-container {
  .el-input {
    display: inline-block;
    height: 47px;
    width: 85%;

    input {
      background: transparent;
      border: 0px;
      -webkit-appearance: none;
      border-radius: 0px;
      padding: 12px 5px 12px 15px;
      color: $light_gray;
      height: 47px;
      caret-color: $cursor;

      &:-webkit-autofill {
        box-shadow: 0 0 0px 1000px $bg inset !important;
        -webkit-text-fill-color: $cursor !important;
      }
    }
  }

  .el-form-item {
    border: 1px solid rgba(255, 255, 255, 0.1);
    background: rgba(0, 0, 0, 0.1);
    border-radius: 5px;
    color: #454545;
  }
}
</style>

<style lang="scss" scoped>
$bg:#2d3a4b;
$dark_gray:#889aa4;
$light_gray:#eee;
#building{
background:url("https://th.bing.com/th/id/OIP.q-vRvB2OYHISox7Q66rE4AHaDV?pid=ImgDet&rs=1");
width:100%;		
height:100%;			
background-size:100% 100%;}
.login-container {
  min-height: 100%;
  width: 100%;
  background-color: $bg;
  overflow: hidden;

  .login-form {
    position: relative;
    width: 520px;
    max-width: 100%;
    padding: 160px 35px 0;
    margin: 0 auto;
    overflow: hidden;
  }

  .tips {
    font-size: 14px;
    color: #fff;
    margin-bottom: 10px;

    span {
      &:first-of-type {
        margin-right: 16px;
      }
    }
  }

  .svg-container {
    padding: 6px 5px 6px 15px;
    color: $dark_gray;
    vertical-align: middle;
    width: 30px;
    display: inline-block;
  }

  .title-container {
    position: relative;

    .title {
      font-size: 26px;
      color: $light_gray;
      margin: 0px auto 40px auto;
      text-align: center;
      font-weight: bold;
    }
  }

  .show-pwd {
    position: absolute;
    right: 10px;
    top: 7px;
    font-size: 16px;
    color: $dark_gray;
    cursor: pointer;
    user-select: none;
  }

  .thirdparty-button {
    position: absolute;
    right: 0;
    bottom: 6px;
  }

  @media only screen and (max-width: 470px) {
    .thirdparty-button {
      display: none;
    }
  }
}
.dialogDiv {
        height: 500px;
        overflow: auto;
    }
  .demo-table-expand {
    font-size: 0;
  }
  .demo-table-expand label {
    width: 190px;
    color: #446696;
  }
  .demo-table-expand .el-form-item {
    margin-right: 0;
    margin-bottom: 0;
    width: 90%;
  }
</style>
