/** When your routing table is too long, you can split it into small modules **/

import Layout from '@/layout'

const tableRouter = {
  path: '/table',
  component: Layout,
  redirect: '/table/complex-table',
  name: 'Table',
  meta: {
    title: 'Cohort Management',
    icon: 'table', 
    roles: ['admin','editor']
  },
  children: [
    
    {
      path: 'complex-table',
      component: () => import('@/views/table/complex-table'),
      name: 'Cohort Management',
      meta: { title: 'Edit All Cohorts' ,roles: ['admin'] }
    },
    {
      path: 'cohorts',
      component: () => import('@/views/table/cohorts'),
      name: 'Cohort Management',
      meta: { title: 'View Cohorts' , roles: ['admin','editor'] }
    },
  ]
}
export default tableRouter
