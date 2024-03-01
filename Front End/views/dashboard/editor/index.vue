<template>
  <div class="dashboard-editor-container"  id="building">
    <div class=" clearfix">
      <pan-thumb :image="avatar" style="float: left">
        Your roles:
        <span v-for="item in roles" :key="item" class="pan-info-roles">{{ item }}</span>
      </pan-thumb>
      <github-corner style="position: absolute; top: 0px; border: 0; right: 0;" />
      <div class="info-container">
        <span class="display_name">{{ name }}</span>
        <span style="font-size:20px;padding-top:20px;display:inline-block;">You can find and edit your cohorts here </span>
      </div>
    </div>
<el-table
    :data="tableData"
    style="width: 100%">
    <el-table-column label="Your Cohorts">
    <el-table-column 
      label="Cohort Id"
      prop="cohortId"
      width="100">
      <template slot-scope="scope">
        <span style="margin-left: 10px">{{ scope.row.cohortId }}</span>
      </template>
    </el-table-column>
    <el-table-column
      label="Cohort Title"
      width="880"
      prop="cohortTitle">
      <template slot-scope="scope">
        <el-popover trigger="hover" placement="top">
          <p>Tags: {{ scope.row.cohortTags }}</p>
          <p>Owner: {{ scope.row.cohortOwner }}</p>
          <div slot="reference" class="name-wrapper">
            <el-tag size="medium">{{ scope.row.cohortTitle }}</el-tag>
          </div>
        </el-popover>
      </template>
    </el-table-column>
    </el-table-column>
    <el-table-column label="Actions">
      <template slot-scope="scope">
        <el-button
        el-icon-document-add
          size="large"
          @click="handleEdit(scope.row)">Edit</el-button>
      </template>
    </el-table-column>
  </el-table>
<el-dialog
  title="Edit cohort"
  :visible.sync="dialogVisible0"
  width="50%"
  :before-close="handleClose">
<el-form :model="ruleForm0" :rules="rules" ref="ruleForm0" label-width="200px" class="demo-ruleForm">
  <el-form-item label="Cohort Title" prop="cohortTitle">
    <el-input v-model="ruleForm0.cohortTitle"></el-input>
  </el-form-item>
    <el-form-item label="Cohort Tag" prop="cohortTags">
    <el-input v-model="ruleForm0.cohortTags"></el-input>
  </el-form-item>
      <el-form-item label="Cohort Weblink" prop="cohortWenlink">
    <el-input v-model="ruleForm0.cohortWebLink"></el-input>
  </el-form-item>
      <el-form-item label="Cohort Funding" prop="cohortFunding">
    <el-input v-model="ruleForm0.cohortFunding"></el-input>
  </el-form-item>
        <el-form-item label="Cohort Key Publication" prop="cohortKeyPublication">
    <el-input v-model="ruleForm0.cohortKeyPublication"></el-input>
  </el-form-item>
  <el-form-item label="Cohort Introduction" prop="cohortIntroducton">
    <el-input type="textarea" v-model="ruleForm0.cohortIntroducton"></el-input>
  </el-form-item>
   <el-form-item label="Cohort Participants" prop="cohortParticipants">
    <el-input v-model="ruleForm0.cohortParticipants"></el-input>
  </el-form-item>
    <el-form-item label="Cohort Male Participants" prop="cohortMparticipants">
    <el-input v-model="ruleForm0.cohortMparticipants"></el-input>
  </el-form-item>
  <el-form-item label="Cohort Female Participants" prop="cohortFparticipants">
    <el-input  v-model="ruleForm0.cohortFparticipants"></el-input>
  </el-form-item>
   <el-form-item label="Participants under 20" prop="cohort20">
    <el-input  v-model="ruleForm0.cohort20"></el-input>
  </el-form-item>
     <el-form-item label="Participants between 20~39" prop="cohort2039">
    <el-input  v-model="ruleForm0.cohort2039"></el-input>
  </el-form-item>
   <el-form-item label="Participants between 40~59" prop="cohort4059">
    <el-input  v-model="ruleForm0.cohort4059"></el-input>
  </el-form-item>
   <el-form-item label="Participants over 60" prop="cohort60">
    <el-input  v-model="ruleForm0.cohort60"></el-input>
  </el-form-item>
  <el-form-item label="Cohort Source" prop="cohortSource">
    <el-input v-model="ruleForm0.cohortSource"></el-input>
  </el-form-item>
   <el-form-item label="Cohort Start Year" prop="cohortStartyear">
    <el-input v-model="ruleForm0.cohortStartyear"></el-input>
  </el-form-item>
  <el-form-item label="Cohort Recent Year" prop="cohortRecentyear">
    <el-input v-model="ruleForm0.cohortRecentyear"></el-input>
  </el-form-item>
    <el-form-item label="Average_Years_Follow_Up" prop="cohortAvayears">
    <el-input v-model="ruleForm0.cohortAvayears"></el-input>
  </el-form-item>
  <el-form-item label="Number_Follow_Ups" prop="cohortNumfollow">
    <el-input v-model="ruleForm0.cohortNumfollow"></el-input>
  </el-form-item>
   <el-form-item label="Withdrawn participants" prop="cohortWithdraw">
    <el-input v-model="ruleForm0.cohortWithdraw"></el-input>
  </el-form-item>
   <el-form-item label="Lost participants" prop="cohortLost">
    <el-input v-model="ruleForm0.cohortLost"></el-input>
  </el-form-item>
     <el-form-item label="Deceased participants" prop="cohortDecrease">
    <el-input v-model="ruleForm0.cohortDecrease"></el-input>
  </el-form-item>
       <el-form-item label="Completed participants" prop="cohortComplete">
    <el-input v-model="ruleForm0.cohortComplete"></el-input>
  </el-form-item>
     <el-form-item label="Timephase" prop="cohortTimephase">
    <el-input v-model="ruleForm0.cohortTimephase"></el-input>
  </el-form-item>
    <el-form-item label="Anthropometrics" prop="cohortAnthropometrics">
    <el-input v-model="ruleForm0.cohortAnthropometrics"></el-input>
  </el-form-item>
  <el-form-item label="Lifestyle" prop="cohortLifestyle">
    <el-select v-model="ruleForm0.cohortLifestyle" placeholder="Choose a liftstyle">
      <el-option label="Nutrition" value="Nutrition"></el-option>
      <el-option label="Physical activty" value="Physical activty"></el-option>
      <el-option label="Smoking" value="Smoking"></el-option>
      <el-option label="Sun exposure" value="Sun exposure"></el-option>
    </el-select>
  </el-form-item>
    <el-form-item label="Health" prop="cohortHealth">
    <el-input v-model="ruleForm0.cohortHealth"></el-input>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="submitForm0('ruleForm0')">Submit</el-button>
    <el-button @click="resetForm('ruleForm0')">Reset</el-button>
  </el-form-item>
</el-form>
  <span slot="footer" class="dialog-footer">
    <el-button @click="dialogVisible0 = false">Cancel</el-button>
  </span>
</el-dialog>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'
import PanThumb from '@/components/PanThumb'
import { deepClone } from '@/utils'
export default {
   created(){
            this.$axios.post("http://localhost:8080/re/cohort/selectCohortOwner",{
              cohortOwner: "200001"
            }).then(res => {
             this.tableData = res.data
        console.log(this.tableData)
      })
      //   this.$axios.get("http://localhost:8080/re/cohort/selectAllCohort").then(res => {
      //  for (let i = 0; i < res.data.length; i++) {
      //   if(res.data[i].cohortOwner =='200001'){
      //   this.tableData.push(res.data[i])
      //   }
      // }
      //   console.log(this.tableData)
      // })
      },
  name: 'DashboardEditor',
  components: { PanThumb},
  data() {
    return {
       rules: {
          cohortTitle: [
            { required: true, message: 'please input cohort title', trigger: 'blur' },
            { min: 0, max: 99, message: 'length between 0 to 99', trigger: 'blur' }
          ],},
        dialogVisible0: false,
        tableData0:[{
           cohortIntroducton: '',
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
          cohortOwner: '',
          cohortMparticipants: '',}
        ],
        ruleForm0: {
          cohortIntroducton: '',
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
          cohortOwner: '',
          cohortMparticipants: '',
        },
    tableData: [{
          cohortIntroducton: '',
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
          cohortOwner: '',
          cohortMparticipants: '',
        }]
    }
  },
  computed: {
    ...mapGetters([
      'name',
      'avatar',
      'roles'
    ])
  },
 methods: {
           submitForm0(ruleForm0) {
            console.log(this.ruleForm0)
        this.$axios.post("http://localhost:8080/re/cohort/updateCohort",{
          cohortTitle: this.ruleForm0.cohortTitle,
          cohortIntroducton: this.ruleForm0.cohortIntroducton,
          cohortTags: this.ruleForm0.cohortTags,
          cohortOwner: this.ruleForm0.cohortOwner,
          cohortId: this.ruleForm0.cohortId,
          cohortWebLink: this.ruleForm0.cohortWebLink,
          cohortMparticipants: this.ruleForm0.cohortMparticipants,
          cohortFparticipants: this.ruleForm0.cohortFparticipants,
          cohortParticipants: this.ruleForm0.cohortParticipants,
          cohortMean: this.ruleForm0.cohortMean,
          cohort20: this.ruleForm0.cohort20,
          cohort2039: this.ruleForm0.cohort2039,
          cohort4059: this.ruleForm0.cohort4059,
          cohort60: this.ruleForm0.cohort60,
          cohortSource: this.ruleForm0.cohortSource,
          cohortStartyear :this.ruleForm0.cohortStartyear,
          cohortRecentyear :this.ruleForm0.cohortRecentyear,
          cohortNumfollow :this.ruleForm0.cohortNumfollow,
          cohortAvayears :this.ruleForm0.cohortAvayears,
          cohortWithdraw :this.ruleForm0.cohortWithdraw,
          cohortLost :this.ruleForm0.cohortLost,
          cohortDecrease :this.ruleForm0.cohortDecrease,
          cohortComplete :this.ruleForm0.cohortComplete,
          cohortTimephase: this.ruleForm0.cohortTimephase,
          cohortAnthropometrics : this.ruleForm0.cohortAnthropometrics,
          cohortLifestyle :this.ruleForm0.cohortLifestyle,
          cohortHealth :this.ruleForm0.cohortHealth,
          cohortFunding : this.ruleForm0.cohortFunding,
          cohortKeyPublication : this.ruleForm0.cohortKeyPublication,
        }) 
        location.reload()
       },
      resetForm(ruleForm0) {
        this.$refs[ruleForm0].resetFields();
      
    },
      handleEdit(e) {
        this.dialogVisible0=true
        this.ruleForm0 = deepClone(e)
        console.log(this.ruleForm0)
      },
    }
  }
</script>

<style lang="scss" scoped>
#building{
background:url("https://getwallpapers.com/wallpaper/full/f/8/e/7086.jpg");
width:100%;		
height:100%;			
background-size:100% 100%;}
  .dashboard-editor-container {
    background-color: #e3e3e3;
    min-height: 100vh;
    padding: 50px 60px 0px;
    .pan-info-roles {
      font-size: 12px;
      font-weight: 700;
      color: #333;
      display: block;
    }
    .info-container {
      position: relative;
      margin-left: 190px;
      height: 150px;
      line-height: 200px;
      .display_name {
        font-size: 48px;
        line-height: 48px;
        color: #212121;
        position: absolute;
        top: 25px;
      }
    }
  }
</style>
