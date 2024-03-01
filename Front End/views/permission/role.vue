<template>
  <div class="app-container" id="building">
    <el-button type="primary" @click="dialogVisible = true">New SuperAdmin</el-button>
    <el-table :data="rolesList" style="width: 100%;margin-top:30px;" border>
     <el-table-column label="Super Administrator">
      <el-table-column align="center" label="ID" prop="superAdminId" width="220">
        <template slot-scope="scope">
          {{ scope.row.superAdminId }}
        </template>
      </el-table-column>
      <el-table-column align="center" label="First name" prop="superAdminFirstName" width="220">
        <template slot-scope="scope">
          {{ scope.row.superAdminFirstName }}
        </template>
      </el-table-column>
      <el-table-column align="header-center" label="Last name" prop="superAdminLastName">
        <template slot-scope="scope">
          {{ scope.row.superAdminLastName }}
        </template>
      </el-table-column>
            <el-table-column align="header-center" label="Password"  prop="superAdminPassword">
        <template slot-scope="scope">
          {{ scope.row.superAdminPassword }}
        </template>
      </el-table-column>
          <el-table-column align="header-center" label="Email" prop="superAdminEmail">
        <template slot-scope="scope">
          {{ scope.row.superAdminEmail }}
        </template>
      </el-table-column>
        <el-table-column align="header-center" label="Role key" prop="superAdminName">
        <template slot-scope="scope">
          {{ scope.row.superAdminName }}
        </template>
      </el-table-column>
       </el-table-column>
      <el-table-column align="center" label="Operations">
        <template slot-scope="scope">
          <el-button type="primary" size="small" @click="handleEdit(scope.row)">Edit</el-button>
          <el-button type="danger" size="small" @click="handleDelete(scope.row)">Delete</el-button>
        </template>
      </el-table-column>
    </el-table>
<el-button type="primary" @click="dialogVisible0 = true">New Admin</el-button>
        <el-table :data="rolesList1" style="width: 100%;margin-top:30px;" border>
     <el-table-column label="Administrator">
      <el-table-column align="center" label="ID" prop="adminId" width="220">
        <template slot-scope="scope">
          {{ scope.row.adminId }}
        </template>
      </el-table-column>
      <el-table-column align="center" label="First name" prop="adminFirstName" width="220">
        <template slot-scope="scope">
          {{ scope.row.adminFirstName }}
        </template>
      </el-table-column>
      <el-table-column align="header-center" label="Last name" prop="adminLastName">
        <template slot-scope="scope">
          {{ scope.row.adminLastName }}
        </template>
      </el-table-column>
            <el-table-column align="header-center" label="Password" prop="adminPassword">
        <template slot-scope="scope">
          {{ scope.row.adminPassword }}
        </template>
      </el-table-column>
          <el-table-column align="header-center" label="Email" prop="adminEmail">
        <template slot-scope="scope">
          {{ scope.row.adminEmail }}
        </template>
      </el-table-column>
        <el-table-column align="header-center" label="Role key" prop="adminName">
        <template slot-scope="scope">
          {{ scope.row.adminName }}
        </template>
      </el-table-column>
       </el-table-column>
      <el-table-column align="center" label="Operations">
        <template slot-scope="scope">
          <el-button type="primary" size="small" @click="handleEdit1(scope.row)">Edit</el-button>
          <el-button type="danger" size="small" @click="handleDelete1(scope.row)">Delete</el-button>
        </template>
      </el-table-column>
    </el-table>
     <el-dialog
  title="Add new superAdmin"
  :visible.sync="dialogVisible"
  width="50%"
  :before-close="handleClose">
<el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="200px" class="demo-ruleForm">
    <el-form-item label="SuperAdmin First Name" prop="superAdminFirstName">
    <el-input v-model="ruleForm.superAdminFirstName"></el-input>
  </el-form-item>
      <el-form-item label="superAdmin Last Name" prop="superAdminLastName">
    <el-input v-model="ruleForm.superAdminLastName"></el-input>
  </el-form-item>
  <el-form-item label="Password" prop="superAdminPassword">
    <el-input type="textarea" v-model="ruleForm.superAdminPassword"></el-input>
  </el-form-item>
   <el-form-item label="Email" prop="superAdminEmail">
    <el-input type="textarea" v-model="ruleForm.superAdminEmail"></el-input>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="submitForm('ruleForm')">Submit</el-button>
    <el-button @click="resetForm('ruleForm')">Reset</el-button>
  </el-form-item>
</el-form>
  <span slot="footer" class="dialog-footer">
    <el-button @click="dialogVisible = false">Cancel</el-button>
  </span>
</el-dialog>
<el-dialog
  title="Edit superAdmin"
  :visible.sync="dialogVisible1"
  width="50%"
  :before-close="handleClose">
<el-form :model="ruleForm1" :rules="rules" ref="ruleForm1" label-width="200px" class="demo-ruleForm">
    <el-form-item label="SuperAdmin First Name" prop="superAdminFirstName">
    <el-input v-model="ruleForm1.superAdminFirstName"></el-input>
  </el-form-item>
      <el-form-item label="superAdmin Last Name" prop="superAdminLastName">
    <el-input v-model="ruleForm1.superAdminLastName"></el-input>
  </el-form-item>
  <el-form-item label="Password" prop="superAdminPassword">
    <el-input type="textarea" v-model="ruleForm1.superAdminPassword"></el-input>
  </el-form-item>
   <el-form-item label="Email" prop="superAdminEmail">
    <el-input type="textarea" v-model="ruleForm1.superAdminEmail"></el-input>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="submitForm2('ruleForm1')">Submit</el-button>
    <el-button @click="resetForm('ruleForm')">Reset</el-button>
  </el-form-item>
</el-form>
  <span slot="footer" class="dialog-footer">
    <el-button @click="dialogVisible1 = false">Cancel</el-button>
  </span>
</el-dialog>
<el-dialog
  title="Edit Admin"
  :visible.sync="dialogVisible2"
  width="50%"
  :before-close="handleClose">
<el-form :model="ruleForm2" :rules="rules" ref="ruleForm2" label-width="200px" class="demo-ruleForm">
    <el-form-item label="Admin First Name" prop="adminFirstName">
    <el-input v-model="ruleForm2.adminFirstName"></el-input>
  </el-form-item>
      <el-form-item label="Admin Last Name" prop="adminLastName">
    <el-input v-model="ruleForm2.adminLastName"></el-input>
  </el-form-item>
  <el-form-item label="Password" prop="adminPassword">
    <el-input type="textarea" v-model="ruleForm2.adminPassword"></el-input>
  </el-form-item>
   <el-form-item label="Email" prop="adminEmail">
    <el-input type="textarea" v-model="ruleForm2.adminEmail"></el-input>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="submitForm3('ruleForm2')">Submit</el-button>
    <el-button @click="resetForm('ruleForm2')">Reset</el-button>
  </el-form-item>
</el-form>
  <span slot="footer" class="dialog-footer">
    <el-button @click="dialogVisible2 = false">Cancel</el-button>
  </span>
</el-dialog>
<el-dialog
  title="Add new Admin"
  :visible.sync="dialogVisible0"
  width="50%"
  :before-close="handleClose">
<el-form :model="ruleForm0" :rules="rules" ref="ruleForm0" label-width="200px" class="demo-ruleForm">
    <el-form-item label="Admin First Name" prop="adminFirstName">
    <el-input v-model="ruleForm0.adminFirstName"></el-input>
  </el-form-item>
      <el-form-item label="Admin Last Name" prop="adminLastName">
    <el-input v-model="ruleForm0.adminLastName"></el-input>
  </el-form-item>
  <el-form-item label="Password" prop="adminPassword">
    <el-input type="textarea" v-model="ruleForm0.adminPassword"></el-input>
  </el-form-item>
   <el-form-item label="Email" prop="adminEmail">
    <el-input type="textarea" v-model="ruleForm0.adminEmail"></el-input>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="submitForm0('ruleForm')">Submit</el-button>
    <el-button @click="resetForm('ruleForm')">Reset</el-button>
  </el-form-item>
</el-form>
  <span slot="footer" class="dialog-footer">
    <el-button @click="dialogVisible0 = false">Cancel</el-button>
  </span>
</el-dialog>
  </div>
</template>
<script>
import { deepClone } from '@/utils'
export default {
  data() {
    return {
      dialogVisible: false,
      dialogVisible0: false,
      dialogVisible1: false,
      dialogVisible2: false,
       ruleForm: {
            superAdminFirstName: '',
            superAdminLastName: '', 
            superAdminPassword: '',
            superAdminEmail: '',
            superAdminName: ''
        },
         ruleForm0: {
            adminId: '',
            adminFirstName: '',
            adminLastName: '', 
            adminPassword: '',
            adminEmail: '',
            adminName: 'editor'
        },
         ruleForm2: {
            adminId: '',
            adminFirstName: '',
            adminLastName: '', 
            adminPassword: '',
            adminEmail: '',
            adminName: '',
        },
          ruleForm1: {
            superAdminId: '',
            superAdminFirstName: '',
            superAdminLastName: '', 
            superAdminPassword: '',
            superAdminEmail: '',
            superAdminName: ''
        },
      rolesList: [{
            superAdminId: '',
            superAdminFirstName: '',
            superAdminLastName: '', 
            superAdminPassword: '',
            superAdminEmail: '',
            superAdminName: ''
      }],
        rolesList1: [{
            adminId: '',
            adminFirstName: '',
            adminLastName: '', 
            adminPassword: '',
            adminEmail: '',
            adminName: ''
      }],
    }
  },
  created() {
    this.$axios.get("	http://localhost:8080/re/superadmin/selectAllSuperadmin").then(res => {
        console.log(res.data)
        this.rolesList = res.data
      })
        this.$axios.get("	http://localhost:8080/re/admin/selectAllAdmin").then(res1 => {
        console.log(res1.data)
        this.rolesList1 = res1.data
      })
  },
   methods: {
      submitForm(ruleForm) {
        console.log(this.ruleForm)
        this.$axios.post("http://localhost:8080/re/superadmin/insertSuperadmin",{
          superAdminFirstName: this.ruleForm.superAdminFirstName,
          superAdminLastName: this.ruleForm.superAdminLastName,
          superAdminPassword: this.ruleForm.superAdminPassword,
          superAdminEmail: this.ruleForm.superAdminEmail,
          superAdminName: 'admin'
        }) 
        this.dialogVisible=false
        location.reload()
       },
         submitForm0(ruleForm0) {
        this.$axios.post("http://localhost:8080/re/admin/insertAdmin",{
          adminFirstName: this.ruleForm0.adminFirstName,
          adminLastName: this.ruleForm0.adminLastName,
          adminPassword: this.ruleForm0.adminPassword,
          adminEmail: this.ruleForm0.adminEmail,
          adminName: 'editor'
        }) 
        this.dialogVisible0 = false
        location.reload()
       },
         submitForm2(e) {
        this.$axios.post("http://localhost:8080/re/superadmin/updateSuperAdmin",{
          superAdminId: this.ruleForm1.superAdminId,
          superAdminFirstName: this.ruleForm1.superAdminFirstName,
          superAdminLastName: this.ruleForm1.superAdminLastName,
          superAdminPassword: this.ruleForm1.superAdminPassword,
          superAdminEmail: this.ruleForm1.superAdminEmail,
          superAdminName: this.ruleForm1.superAdminName,
        }) 
        location.reload()
       },
          submitForm3(e) {
        this.$axios.post("http://localhost:8080/re/admin/updateAdmin",{
          adminId :this.ruleForm2.adminId,
          adminFirstName: this.ruleForm2.adminFirstName,
          adminLastName: this.ruleForm2.adminLastName,
          adminPassword: this.ruleForm2.adminPassword,
          adminEmail: this.ruleForm2.adminEmail,
          adminName: this.ruleForm2.adminName
        }) 
        location.reload()
        console.log(this.ruleForm2)
       },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      
    },

handleDelete (e) {
      alert(JSON.stringify(e))
      alert(e.superAdminId)
      this.$confirm('This operation will permanently delete the user information. Continue?', 'alert', {
        confirmButtonText: 'submit',
        cancleButtonText: 'cancel',
        type: 'warning'
      }).then(() => {
        this.$axios.post("http://localhost:8080/re/superadmin/deleteSuperAdmin", {superAdminId: e.superAdminId})
          .then(alert('success'),
            location.reload()
          )
      })
},
handleDelete1 (e) {
      alert(JSON.stringify(e))
      alert(e.adminId)
      this.$confirm('This operation will permanently delete the user information. Continue?', 'alert', {
        confirmButtonText: 'submit',
        cancleButtonText: 'cancel',
        type: 'warning'
      }).then(() => {
        this.$axios.post("http://localhost:8080/re/admin/deleteAdmin", {adminId: e.adminId})
          .then(alert('success'),
            location.reload()
          )
      })
},
handleEdit(e){
  this.dialogVisible1=true
this.ruleForm1 = deepClone(e)
},
handleEdit1(e){
  this.dialogVisible2=true
this.ruleForm2 = deepClone(e)
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
.app-container {
  .roles-table {
    margin-top: 30px;
  }
}
</style>
