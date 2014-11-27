-- #VendorCheckIntegerSum#

select sum(vendor.TYPE_OF_NUMERIC_INTEGER) as INTEGER_NON_DIGIT_SUM
  from VENDOR_CHECK vendor
