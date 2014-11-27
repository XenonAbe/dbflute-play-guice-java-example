-- #df:x#

-- !df:pmb!
-- !!String string!!
-- !!Integer integer!!
-- !!BigDecimal bigDecimal!!
-- !!Date date!!
-- !!Timestamp timestamp!!
-- !!boolean exists!!
-- !!boolean notExists!!
-- !!List<String> list!!
-- !!Map<String, Integer> map!!
-- !!$$CDef$$ cdef!!

select member.MEMBER_ID
     , member.MEMBER_NAME
  /*IF pmb.string != null*/
  from MEMBER member
  /*END*/
 wh/*IF pmb.exists*/e/*END*//*IF !pmb.notExists*/r/*END*//*IF pmb.exists == true*/e/*END*/
   /*IF pmb.string == 'Pixy' && pmb.integer > 0 && pmb.getDate() > date '2000/03/28'*/
   member.MEMBER_NAME
   /*END*/
    like /*pmb.string*/'S' || '%'
   /*IF pmb.integer != null && pmb.getDate() != null && pmb.bigDecimal > 1.6 && date '2000/03/28' < pmb.getDate()*/
   and
   /*END*/
   /*IF pmb.integer <= -6 || pmb.getDate() == null || pmb.timestamp > date '2000/03/28'*/
   member.BIRTHDATE
   /*END*/
    <= /*pmb.date*/'2000-12-12'
   /*IF pmb.list != null && !pmb.list.isEmpty()*/
   and member.MEMBER_STATUS_CODE
   /*END*/
   /*IF pmb != null*/in/*END*/
   /*pmb.list*/('FML', 'PVS')/*END*/
   /*IF pmb.map != null && !pmb.map.isEmpty() && pmb.map.fooKey == 99*/
   order
   /*END*/
   by
   /*IF pmb.cdef != null && pmb.cdef.code() == 'FML'*/
   member.MEMBER_ID asc
   /*END*/
